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
 
function Cancelacion(args, extractResult, option) {
    var url = 'http://pruebascfdi.smartweb.com.mx/Cancelacion/wsCancelacion.asmx?WSDL';
     
    var response = function(err, result) {
        if (err != null)
            throw err.body;
        switch(option) {
            case '1':
                extractResult(result.CancelarCSDResult);
                break;
            case '2':
                extractResult(result.CancelarPEMResult);
                break;
            default:
                throw 'Ingreso una operacion no valida';
                break;
        }
    }
     
    var request = function(err, client) {
        switch(option) {
            case '1':
                client.CancelarCSD(args, response);
                break;
            case '2':
                client.CancelarPEM(args, response);
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
console.log('Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM');
stdin.on('data', function(chunk, key) {
    key = chunk.toString();
    console.log(key);
    switch(key) {
        case '1':
            var cerB64 = fs.readFileSync('Files\\aad990814bp7_1210261233s.cer').toString('base64');
            var keyB64 = fs.readFileSync('Files\\aad990814bp7_1210261233s.key').toString('base64');
            var uuids = ['17aeeccc-6ec0-49af-b786-0878d34e0b27', 'a3216283-078c-418e-bf2c-2fb62e418d45'];
            var args = {
                CSDCer: cerB64,
                CSDKey: keyB64,
                password: '12345678a',
                RFCEmisor: 'AAD990814BP7',
                UUIDs: { string: uuids }
            };
            break;
        case '2':
            var cerB64 = fs.readFileSync('Files\\aad990814bp7_1210261233s.cer.pem').toString('base64');
            var keyB64 = fs.readFileSync('Files\\aad990814bp7_1210261233s.key.pem').toString('base64');
            var uuids = ['17aeeccc-6ec0-49af-b786-0878d34e0b27', 'a3216283-078c-418e-bf2c-2fb62e418d45'];
            var args = {
                PEMCer: cerB64,
                PEMKey: keyB64,
                RFCEmisor: 'AAD990814BP7',
                UUIDs: { string: uuids }
            };
            break;
    }
    try {
        var cancelacion = new Cancelacion(args, printResult, key);
        var autentica = new Autentica(credentials, cancelacion.init);
    } catch(err) {
        console.log(err);
    }
});
