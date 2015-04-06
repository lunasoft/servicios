from suds.client import Client
 
urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
autentica = Client(urlAutentica, faults = False)
try:
    token = autentica.service.AutenticarBasico('demo', '123456789')
    print(token[1])
except Exception as e:
    print(e)