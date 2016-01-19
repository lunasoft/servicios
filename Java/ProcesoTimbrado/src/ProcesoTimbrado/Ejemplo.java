/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoTimbrado;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author NetDeveloper
 */
public class Ejemplo {
    public static void main(String[] args ){
        try{
             ServiciosSW servicios = new ServiciosSW(false);
             
             String token =  servicios.Autenticar("demo", "123456789");
             System.out.println("token: " + token);
             
             String xml = readFile("C:\\Users\\NetDeveloper\\Documents\\00_factura_1_peso_DAF100414LJ4.xml", StandardCharsets.UTF_8);
             
             String xmlOutput = servicios.Timbrar(xml, token);
        }
        catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
    }    
    
    public static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }   
}
