from suds.client import Client
import sys

reload(sys)
sys.setdefaultencoding('utf-8')
urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
urlTimbrado = 'http://pruebascfdi.smartweb.com.mx/Timbrado/wsTimbrado.asmx?WSDL'
autentica = Client(urlAutentica, faults = False)
timbrado = Client(urlTimbrado, faults = False)
 
try:
    token = autentica.service.AutenticarBasico('demo', '123456789')[1]
    xml = None
    with open('Files\\factura1peso.xml') as f:
        xml = f.read()

    option = str(input('Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2\n'))
    if option == '1':
        result = timbrado.service.TimbrarXML(xml, token)[1]
    elif option == '2':
        result = timbrado.service.TimbrarXMLV2(xml, token)[1]
    else:
        result = 'Ingreso una operacion no valida'
    print(result)
except Exception as e:
    print(e)