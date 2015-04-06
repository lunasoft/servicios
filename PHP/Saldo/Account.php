<?php
    $context = stream_context_create(
        array(
            'ssl' => array(
                'verify_peer' => false,
                'verify_peer_name'  => false
            )
        )
    );
     
    $options = array('trace' => 1, 'exceptions' => true);
    $urlAccount = 'https://pruebascfdi.smartweb.com.mx/Account/wsAccount.svc?WSDL';
    $optionsCertificate = array(
        'cache_wsdl' => WSDL_CACHE_NONE,
        'trace' => 1,
        'exceptions' => true,
        'stream_context' => $context
    );
    $urlAutentica = 'http://pruebascfdi.smartweb.com.mx/Autenticacion/wsAutenticacion.asmx?WSDL';
     
    try
    {
        $autentica = new SoapClient($urlAutentica, $options);
        $account = new SoapClient($urlAccount, $optionsCertificate);
        $credentials = array('usuario' => 'demo', 'password' => '123456789');
        $token = $autentica->AutenticarBasico($credentials)->AutenticarBasicoResult;
        $header = new SoapHeader('http://soapinterop.org/echoheader/', 'token', $token);
        $account->__setSoapHeaders($header);
        $saldoCliente = $account->GetSaldoClientById(null)->GetSaldoClientByIdResult;
        echo $saldoCliente->SaldoTimbres . "\n";
        echo $saldoCliente->TimbresUtilizados . "\n";
    }
    catch(SoapFault $e)
    {
        echo $e->faultstring;
    }
?>