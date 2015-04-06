package saldo;

import Account.IwsAccount;
import Account.SaldoCliente;
import Account.WsAccount;
import Autenticacion.WsAutenticacion;
import Autenticacion.WsAutenticacionSoap;
import com.sun.xml.internal.ws.api.message.Headers;
import com.sun.xml.internal.ws.developer.WSBindingProvider;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;

public class Saldo {

    public static void main(String[] args) {
        TrustManager[] trustAllCerts = new TrustManager[] {
            new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] xcs, String string) { }
 
                @Override
                public void checkServerTrusted(X509Certificate[] xcs, String string) { }
 
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            }
        };
         
        HostnameVerifier allHostValid = new HostnameVerifier() {
            @Override
            public boolean verify(String string, SSLSession ssls) {
                return true;
            }
        };
         
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(allHostValid);
            WsAutenticacionSoap autenticacion = new WsAutenticacion().getWsAutenticacionSoap();
            IwsAccount account = new WsAccount().getAccountEndpoint();
            WSBindingProvider bp = (WSBindingProvider)account;
            String token = autenticacion.autenticarBasico("demo", "123456789");
            bp.setOutboundHeaders(
                Headers.create(new QName("http://soapinterop.org/echoheader/", "token"), token)
            );
            SaldoCliente cliente = account.getSaldoClientById(null);
            System.out.println(cliente.getSaldoTimbres());
            System.out.println(cliente.getTimbresUtilizados().getValue());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
