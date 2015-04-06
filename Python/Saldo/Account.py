from suds.client import Client
import base64
import ssl
# import urllib
import urllib2

# urllib.request.urlopen(context=ssl._create_unverified_context())

urlAccount = 'https://pruebascfdi.smartweb.com.mx/Account/wsAccount.svc?wsdl'
urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
# urllib2.urlopen(urlAccount, context = ssl._create_unverified_context())

autentica = Client(urlAutentica, faults = False)
 
try:
    token = autentica.service.AutenticarBasico('demo', '123456789')[1]
    account = Client(urlAccount, faults = False, headers = {'token' : token})
    saldoCliente = account.service.GetSaldoClientById(None)[1]
    print(saldoCliente.SaldoTimbres)
    print(saldoCliente.TimbresUtilizados)
except Exception as e:
    print(e)