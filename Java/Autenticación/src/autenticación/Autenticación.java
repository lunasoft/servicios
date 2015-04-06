package autenticación;

import Autenticacion.WsAutenticacion;
import Autenticacion.WsAutenticacionSoap;

public class Autenticación {
    
    public static void main(String[] args) {
        WsAutenticacionSoap autenticacion = new WsAutenticacion().getWsAutenticacionSoap();
        String token = autenticacion.autenticarBasico("demo", "123456789");
        System.out.println(token);
    }
}
