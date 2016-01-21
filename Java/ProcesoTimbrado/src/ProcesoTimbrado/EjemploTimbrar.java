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
public class EjemploTimbrar {
    public static void main(String[] args ){
        try{
             ServiciosSW servicios = new ServiciosSW();
             
             String token =  servicios.Autenticar("demo", "123456789");
             System.out.println("token: " + token);
             
             String xml = "xml factura sellada";
             
             String xmlOutput = servicios.TimbrarV2(xml, token);
             System.out.println(xmlOutput);
        }
        catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
    }       
}
