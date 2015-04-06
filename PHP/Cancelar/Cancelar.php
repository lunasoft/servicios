<?php
    $options = array('trace' => 1, 'exceptions' => true);
    $urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL';
    $urlCancelacion = 'http://pruebascfdi.smartweb.com.mx/Cancelacion/wsCancelacion.asmx?WSDL';

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
        $cancelacion = new SoapClient($urlCancelacion, $options);
        $credentials = array('usuario' => 'demo', 'password' => '123456789');
        $token = $autentica->AutenticarBasico($credentials)->AutenticarBasicoResult;
        //Los UUIDs para este ejemplo fueron generados de manera aleatoria
        $uuids = array('17aeeccc-6ec0-49af-b786-0878d34e0b27', 'a3216283-078c-418e-bf2c-2fb62e418d45');
        switch (readline("Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM\n")) {
            case '1':
                $cer = file_get_contents('Files\\aad990814bp7_1210261233s.cer');
                $key = file_get_contents('Files\\aad990814bp7_1210261233s.key');
                $cerB64 = base64_encode($cer);
                $keyB64 = base64_encode($key);
                $cancelacionData = array(
                    'CSDCer' => $cerB64,
                    'CSDKey' => $keyB64,
                    'password' => '12345678a',
                    'RFCEmisor' => 'AAD990814BP7',
                    'UUIDs' => $uuids,
                    'tokenAutenticacion' => $token
                );
                $result = $cancelacion->CancelarCSD($cancelacionData)->CancelarCSDResult;
                break;
            case '2':
                $cer = file_get_contents('Files\\aad990814bp7_1210261233s.cer.pem');
                $key = file_get_contents('Files\\aad990814bp7_1210261233s.key.pem');
                $cerB64 = base64_encode($cer);
                $keyB64 = base64_encode($key);
                $cancelacionData = array(
                    'PEMCer' => $cerB64,
                    'PEMKey' => $keyB64,
                    'RFCEmisor' => 'AAD990814BP7',
                    'UUIDs' => $uuids,
                    'tokenAutenticacion' => $token
                );
                $result = $cancelacion->CancelarPEM($cancelacionData)->CancelarPEMResult;
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