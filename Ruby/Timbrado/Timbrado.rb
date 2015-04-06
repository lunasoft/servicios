require 'savon'
 
autentica = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL'
end
timbrado = Savon.client do
    wsdl 'http://pruebascfdi.smartweb.com.mx/Timbrado/wsTimbrado.asmx?WSDL'
end
begin
    response = autentica.call(:autenticar_basico) do
        message usuario: 'demo', password: '123456789'
    end
    token = response.body[:autenticar_basico_response][:autenticar_basico_result]
    xml = File.readlines('Files\\factura1peso.xml').join('')
    puts "Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2\n"
    case gets.chomp
    when '1'
        response = timbrado.call(:timbrar_xml) do
            message xml_comprobante: xml, token_autenticacion: token
        end
        result = response.body[:timbrar_xml_response][:autenticar_basico_result]
    when '2'
         response = timbrado.call(:timbrar_xmlv2) do
            message xml_comprobante: xml, token_autenticacion: token
        end
        result = response.body[:timbrar_xmlv2_response][:autenticar_basico_result]
    else
        result 'Ingreso una operacion no valida'
    end
    puts result
rescue => e
    puts e
end