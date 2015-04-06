var fs = require('fs');
var soap = require('soap');

var stdin = process.openStdin(); 
stdin.setRawMode(true);
 
function printResult(value) {
    console.log(value);
    process.exit();
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
 
function Timbrado(args, extractResult, option) {
    var url = 'http://pruebascfdi.smartweb.com.mx/Timbrado/wsTimbrado.asmx?WSDL';
     
    var response = function(err, result) {
        if (err != null)
            throw err.body;
        switch(option) {
            case '1':
                extractResult(result.TimbrarXMLResult);
                break;
            case '2':
                extractResult(result.TimbrarXMLV2Result);
                break;
            default:
                throw 'Ingreso una operacion no valida';
                break;
        }
    }
     
    var request = function(err, client) {
        switch(option) {
            case '1':
                client.TimbrarXML(args, response);
                break;
            case '2':
                client.TimbrarXMLV2(args, response);
                break;
            default:
                throw 'Ingreso una operacion no valida';
                break;
        }
    }
     
    this.init = function(token) {
        args['tokenAutenticacion'] = token;
        soap.createClient(url, request);
    }
}
 
var credentials = { usuario: 'demo', password: '123456789' };
console.log('Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2');
stdin.on('data', function(chunk, key) {

    key = chunk.toString();
    console.log(key);
    var args = { xmlComprobante: fs.readFileSync('Files\\factura1peso.xml').toString() };
    try {
        var timbrado = new Timbrado(args, printResult, key);
        var autentica = new Autentica(credentials, timbrado.init);
    } catch(err) {
        console.log(err);
    }

});