from suds.client import Client
import base64
import sys

reload(sys)
sys.setdefaultencoding('utf-8')
urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
urlCancelacion = 'http://pruebascfdi.smartweb.com.mx/Cancelacion/wsCancelacion.asmx?WSDL'
autentica = Client(urlAutentica, faults = False)
cancelacion = Client(urlCancelacion, faults = False)
 
try:
    token = autentica.service.AutenticarBasico('demo', '123456789')[1]
    option = str(input('Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM\n'))
    # Los UUIDs para este ejemplo fueron generados de manera aleatoria
    uuids = ['17aeeccc-6ec0-49af-b786-0878d34e0b27', 'a3216283-078c-418e-bf2c-2fb62e418d45']
    uuidsSuds = cancelacion.factory.create('ArrayOfString')
    uuidsSuds.string = uuids

    if option == '1':
        cerFile = open('Files\\aad990814bp7_1210261233s.cer', 'rb')
        keyFile = open('Files\\aad990814bp7_1210261233s.key', 'rb')
        cer = cerFile.read()
        key = keyFile.read()
        cerB64 = base64.b64encode(cer).decode()
        keyB64 = base64.b64encode(key).decode()
        cerFile.close()
        keyFile.close()
        result = cancelacion.service.CancelarCSD(cerB64, keyB64, "12345678a", "AAD990814BP7", uuidsSuds, token)[1]
    elif option == '2':
        cerFile = open('Files\\aad990814bp7_1210261233s.cer.pem', 'rb')
        keyFile = open('Files\\aad990814bp7_1210261233s.key.pem', 'rb')
        cer = cerFile.read()
        key = keyFile.read()
        cerB64 = base64.b64encode(cer).decode()
        keyB64 = base64.b64encode(key).decode()
        cerFile.close()
        keyFile.close()
        result = cancelacion.service.CancelarPEM(cerB64, keyB64, "AAD990814BP7", uuidsSuds, token)[1]
    else:
        result = 'Ingreso una operacion no valida'
    print(result)
except Exception as e:
    print(e)