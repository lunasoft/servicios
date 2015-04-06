require 'savon'
 
autentica = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
end
begin
    response = autentica.call(:autenticar_basico) do
        message usuario: 'demo', password: '123456789'
    end
    token = response.body[:autenticar_basico_response][:autenticar_basico_result]
    account = Savon.client do
        wsdl 'https://pruebascfdi.smartweb.com.mx/Account/wsAccount.svc?wsdl'
        ssl_verify_mode :none
        headers 'token' => token
    end
    response = account.call(:get_saldo_client_by_id)
    saldoCliente = response.body[:get_saldo_client_by_id_response][:get_saldo_client_by_id_result]
    puts saldoCliente[:saldo_timbres]
    puts saldoCliente[:timbres_utilizados]
rescue => e
    puts e
end