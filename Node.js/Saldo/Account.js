var soap = require('soap');
 
process.env.NODE_TLS_REJECT_UNAUTHORIZED = "0";
 
function printResult(value) {
    console.log(value);
}
 
function Autentica(args, extractToken) {
    var url = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL';
     
    var response = function(err, result) {
        if (err != null)
            throw err.body;
        extractToken(result.AutenticarBasicoResult);
    }
     
    var request = function(err, client) {
        client.AutenticarBasico(args, response);
    }
     
    soap.createClient(url, request);
}
 
function Account(extractResult) {
    var url = 'https://pruebascfdi.smartweb.com.mx/Account/wsAccount.svc?WSDL';
    var header = null;
    var _client = null
     
    var response = function(err, result) {
        if (err != null)
            throw err.body;
        extractResult(result.GetSaldoClientByIdResult.SaldoTimbres);
        extractResult(result.GetSaldoClientByIdResult.TimbresUtilizados);
    }
     
    var request = function(err, client) {
        _client = client;
        client.addSoapHeader(header, 'token', null, 'http://soapinterop.org/echoheader/');
        client.GetSaldoClientById({}, response);
    }
     
    this.init = function(token) {
        header = { token: token };
        soap.createClient(url, request);
    }
}
 
var credentials = { usuario: 'demo', password: '123456789' };
try {
    var account = new Account(printResult);
    var autentica = new Autentica(credentials, account.init);
} catch(err) {
    console.log(err);
}