package timbrado;

import Autenticacion.WsAutenticacion;
import Autenticacion.WsAutenticacionSoap;
import Timbrar.WsTimbrado;
import Timbrar.WsTimbradoSoap;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Timbrado {
    
    public static void main(String[] args) {
        try {
            WsAutenticacionSoap autentica = new WsAutenticacion().getWsAutenticacionSoap();
            WsTimbradoSoap timbrado = new WsTimbrado().getWsTimbradoSoap();
            String token = autentica.autenticarBasico("demo", "123456789");
            File file = new File("Files\\factura1peso.xml");
            FileInputStream reader = new FileInputStream(file);
            int size = (int)file.length();
            byte[] buffer = new byte[size];
            reader.read(buffer, 0, size);
            String xml = new String(buffer, "utf-8");
            System.out.println("Seleccione una opcion:\n1. TimbrarXML\n2. TimbrarXMLV2");
            String result;
            Scanner keyboard = new Scanner(System.in);
            switch (keyboard.nextInt()) {
                case 1:
                    result = timbrado.timbrarXML(xml, token);
                    break;
                case 2:
                    result = timbrado.timbrarXMLV2(xml, token);
                    break;
                default:
                    result = "Ingreso una operacion no valida";
                    break;
            }
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
