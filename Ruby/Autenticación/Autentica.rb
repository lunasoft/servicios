require 'savon'
 
autentica = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
end
begin
    response = autentica.call(:autenticar_basico) do
        message usuario: 'demo', password: '123456789'
    end
    token = response.body[:autenticar_basico_response][:autenticar_basico_result]
    puts token
rescue => e
    puts e
end