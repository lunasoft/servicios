package cancelar;

import Autenticacion.WsAutenticacion;
import Autenticacion.WsAutenticacionSoap;
import Cancelacion.WsCancelacion;
import Cancelacion.WsCancelacionSoap;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import sun.misc.BASE64Encoder;

public class Cancelar {

    public static void main(String[] args) {
        try {
            WsAutenticacionSoap autentica = new WsAutenticacion().getWsAutenticacionSoap();
            WsCancelacionSoap cancelacion = new WsCancelacion().getWsCancelacionSoap();
            String token = autentica.autenticarBasico("demo", "123456789");
            System.out.println("Seleccione una opcion:\n1. CancelaCSD\n2. CancelaPEM");
            BASE64Encoder encoder = new BASE64Encoder();
            File fileCer;
            File fileKey;
            FileInputStream readerCer;
            FileInputStream readerKey;
            int sizeCer;
            int sizeKey;
            byte[] bufferCer;
            byte[] bufferKey;
            String result;
            String cerB64;
            String keyB64;
            // Los UUIDs para este ejemplo fueron generados de manera aleatoria
            ArrayOfString uuids = new ArrayOfString();
            uuids.addString("17aeeccc-6ec0-49af-b786-0878d34e0b27");
            uuids.addString("a3216283-078c-418e-bf2c-2fb62e418d45");
            
            Scanner keyboard = new Scanner(System.in);
            switch (keyboard.nextInt()) {
                case 1:
                    fileCer = new File("Files\\aad990814bp7_1210261233s.cer");
                    fileKey = new File("Files\\aad990814bp7_1210261233s.key");
                    readerCer = new FileInputStream(fileCer);
                    readerKey = new FileInputStream(fileKey);
                    sizeCer = (int)fileCer.length();
                    sizeKey = (int)fileKey.length();
                    bufferCer = new byte[sizeCer];
                    bufferKey = new byte[sizeKey];
                    readerCer.read(bufferCer, 0, sizeCer);
                    readerKey.read(bufferKey, 0, sizeKey);
                    cerB64 = encoder.encode(bufferCer);
                    keyB64 = encoder.encode(bufferKey);
                    result = cancelacion.cancelarCSD(cerB64, keyB64, "12345678a", "AAD990814BP7", uuids, token);
                    break;
                case 2:
                    fileCer = new File("Files\\aad990814bp7_1210261233s.cer.pem");
                    fileKey = new File("Files\\aad990814bp7_1210261233s.key.pem");
                    readerCer = new FileInputStream(fileCer);
                    readerKey = new FileInputStream(fileKey);
                    sizeCer = (int)fileCer.length();
                    sizeKey = (int)fileKey.length();
                    bufferCer = new byte[sizeCer];
                    bufferKey = new byte[sizeKey];
                    readerCer.read(bufferCer, 0, sizeCer);
                    readerKey.read(bufferKey, 0, sizeKey);
                    cerB64 = encoder.encode(bufferCer);
                    keyB64 = encoder.encode(bufferKey);
                    result = cancelacion.cancelarPEM(cerB64, keyB64, "AAD990814BP7", uuids, token);
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
    
    public static class ArrayOfString extends Cancelacion.ArrayOfString {
        
        public ArrayOfString() {
            this.string = new ArrayList<String>();
        }
        
        public void addString(String value) {
            this.string.add(value);
        }
    }
}
