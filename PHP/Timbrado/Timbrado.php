<?php
    $options = array('trace' => 1, 'exceptions' => true);
    $urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL';
    $urlTimbrado = 'http://pruebascfdi.smartweb.com.mx/Timbrado/wsTimbrado.asmx?WSDL';

    function readline($prompt = null) {
        if($prompt)
            echo $prompt;

        $fp = fopen("php://stdin","r");
        $line = rtrim(fgets($fp, 1024));
        return $line;
    }
     
    try
    {
        $autentica = new SoapClient($urlAutentica, $options);
        $timbrado = new SoapClient($urlTimbrado, $options);
        $credentials = array('usuario' => 'demo', 'password' => '123456789');
        $token = $autentica->AutenticarBasico($credentials)->AutenticarBasicoResult;
        $xml = file_get_contents('Files\\factura1peso.xml');
        $timbrarData = array('xmlComprobante' => $xml, 'tokenAutenticacion' => $token);
        switch (readline("Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2\n")) {
            case '1':
                $result = $timbrado->TimbrarXML($timbrarData)->TimbrarXMLResult;
                break;
            case '2':
                $result = $timbrado->TimbrarXMLV2($timbrarData)->TimbrarXMLV2sResult;
                break;
            default:
                $result = 'Ingreso una operacion no valida';
                break;
        }
        echo $result;
    }
    catch(SoapFault $e)
    {
        echo $e->faultstring;
    }
?>