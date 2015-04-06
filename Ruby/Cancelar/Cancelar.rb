require 'base64'
require 'savon'
 
autentica = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
end
cancelacion = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Cancelacion/wsCancelacion.asmx?WSDL'
end
begin
    response = autentica.call(:autenticar_basico) do
        message usuario: 'demo', password: '123456789'
    end
    token = response.body[:autenticar_basico_response][:autenticar_basico_result]
    # Los UUIDs para este ejemplo fueron generados de manera aleatoria
    uuids = ['17aeeccc-6ec0-49af-b786-0878d34e0b27', 'a3216283-078c-418e-bf2c-2fb62e418d45']
    puts "Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM"
    case gets.chomp
    when '1'
        cer = IO.binread('Files\\aad990814bp7_1210261233s.cer')
        key = IO.binread('Files\\aad990814bp7_1210261233s.key')
        cerB64 = Base64.encode64(cer)
        keyB64 = Base64.encode64(key)
        response = cancelacion.call(:cancelar_csd, message: {
            'CSDCer' => cerB64,
            'CSDKey' => keyB64,
            password: '12345678a',
            'RFCEmisor' => 'AAD990814BP7',
            'UUIDs' => {string: uuids},
            token_autenticacion: token
        })
        result = response.body[:cancelar_csd_response][:cancelar_csd_result]
    when '2'
        cer = IO.binread('Files\\aad990814bp7_1210261233s.cer.pem')
        key = IO.binread('Files\\aad990814bp7_1210261233s.key.pem')
        cerB64 = Base64.encode64(cer)
        keyB64 = Base64.encode64(key)
        response = cancelacion.call(:cancelar_pem, message: {
            'CSDCer' => cerB64,
            'CSDKey' => keyB64,
            'RFCEmisor' => 'AAD990814BP7',
            'UUIDs' => {string: uuids},
            token_autenticacion: token
        })
        result = response.body[:cancelar_pem_response][:cancelar_pem_result]
    else
        result = 'Ingreso una operacion no valida'
    end
    puts result
rescue => e
    puts e
end