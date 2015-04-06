var soap = require('soap')
 
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
 
var credentials = { usuario: 'demo', password: '123456789' };
try {
    var autentica = new Autentica(credentials, printResult);
} catch(err) {
    console.log(err);
}