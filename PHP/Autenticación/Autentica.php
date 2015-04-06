<?php
	$options = array('trace' => 1, 'exceptions' => true);
    $urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL';
    try
    {
        $autentica = new SoapClient($urlAutentica, $options);
        $credentials = array('usuario' => 'demo', 'password' => '123456789');
        $token = $autentica->AutenticarBasico($credentials)->AutenticarBasicoResult;
        echo $token;
    }
    catch(SoapFault $e)
    {
        echo $e->faultstring;
    }
?>