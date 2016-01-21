/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesoTimbrado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author NetDeveloper
 */
public class ServiciosSW {   
    
    private final AuthTest.WsAutenticacionSoap _autenticacionTest;    
    private final StampTest.WsTimbradoSoap _stampTest;    
    private final CancelTest.WsCancelacionSoap _cancelTest;    
    
    public ServiciosSW(){              
            AuthTest.WsAutenticacion authServiceTest = new AuthTest.WsAutenticacion();
            this._autenticacionTest = authServiceTest.getWsAutenticacionSoap();

            StampTest.WsTimbrado stampServiceTest = new StampTest.WsTimbrado();
            this._stampTest = stampServiceTest.getWsTimbradoSoap();
            
            CancelTest.WsCancelacion cancelServiceTest = new CancelTest.WsCancelacion();
            this._cancelTest = cancelServiceTest.getWsCancelacionSoap();        
    }
    
    /**
     * Autenticación para servicios de smarterweb
     * @param user
     * @param pass
     * @return 
     */
    public String Autenticar(String user, String pass) {
        return  _autenticacionTest.autenticarBasico(user, pass);
    }
    
    /**
     * Timbra factura y devuelve unicamente el tfd en texto plano
     * @param xml
     * @param token
     * @return 
     */
    public String Timbrar(String xml, String token){
        return  _stampTest.timbrarXML(xml, token);
    }
    
    /**
     * Timbra factura y devuelve todo el comprobante con todo y tfd en texto plano
     * @param xml
     * @param token
     * @return 
     */
    public String TimbrarV2(String xml, String token){
        return  _stampTest.timbrarXMLV2(xml, token);
    }
    
    /**
     * Cancelacion básica, devuelve un acuse de cancelacion
     * @param csdB64
     * @param keyB64
     * @param password
     * @param rfcEmisor
     * @param uuids
     * @param token
     * @return 
     */
    public String Cancelar(String csdB64, String keyB64, String password, String rfcEmisor, String[] uuids, String token ){
        StringArrayTest uuidsListTest = new StringArrayTest();
        uuidsListTest.setString(uuids);

        return _cancelTest.cancelarCSD(csdB64, keyB64, password, rfcEmisor, uuidsListTest, token);
    }    
     private class StringArrayTest extends CancelTest.ArrayOfString {
        public StringArrayTest() {
            super();
        }

        public List<String> setString(String[] strings) {
            if (string == null) {
                string = new ArrayList<String>();
            }
            string.addAll(Arrays.asList(strings));
            return this.string;
        }
    }
}




