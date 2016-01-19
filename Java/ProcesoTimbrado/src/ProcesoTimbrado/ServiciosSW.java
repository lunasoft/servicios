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
    
    private boolean _isProduction;
    
    
    private AuthProd.WsAutenticacionSoap _autenticacionProd;
    private AuthTest.WsAutenticacionSoap _autenticacionTest;
    
    
    private StampProd.WsTimbradoSoap _stampProd;
    private StampTest.WsTimbradoSoap _stampTest;
    
    private CancelProd.WsCancelacionSoap _cancelProd;
    private CancelTest.WsCancelacionSoap _cancelTest;
    
    
    public ServiciosSW(boolean isProduction){
        this._isProduction = isProduction;
        

        if (isProduction) {
            AuthProd.WsAutenticacion authServiceProd = new AuthProd.WsAutenticacion();
            this._autenticacionProd = authServiceProd.getWsAutenticacionSoap();

            StampProd.WsTimbrado stampServiceProd = new StampProd.WsTimbrado();
            this._stampProd = stampServiceProd.getWsTimbradoSoap();
            
            CancelProd.WsCancelacion cancelServiceProd = new CancelProd.WsCancelacion();
            this._cancelProd = cancelServiceProd.getWsCancelacionSoap();
        } else {
            AuthTest.WsAutenticacion authServiceTest = new AuthTest.WsAutenticacion();
            this._autenticacionTest = authServiceTest.getWsAutenticacionSoap();

            StampTest.WsTimbrado stampServiceTest = new StampTest.WsTimbrado();
            this._stampTest = stampServiceTest.getWsTimbradoSoap();
            
            CancelTest.WsCancelacion cancelServiceTest = new CancelTest.WsCancelacion();
            this._cancelTest = cancelServiceTest.getWsCancelacionSoap();
        }       
    }
    
    /**
     * Autenticación para servicios de smarterweb
     * @param user
     * @param pass
     * @return 
     */
    public String Autenticar(String user, String pass) {
        return _isProduction ? 
                _autenticacionProd.autenticarBasico(user, pass) : _autenticacionTest.autenticarBasico(user, pass);
    }
    
    /**
     * Timbra factura y devuelve unicamente el tfd en texto plano
     * @param xml
     * @param token
     * @return 
     */
    public String Timbrar(String xml, String token){
        return _isProduction ?
                _stampProd.timbrarXML(xml, token) : _stampTest.timbrarXML(xml, token);
    }
    
    /**
     * Timbra factura y devuelve todo el comprobante con todo y tfd en texto plano
     * @param xml
     * @param token
     * @return 
     */
    public String TimbrarV2(String xml, String token){
        return _isProduction ?
                _stampProd.timbrarXMLV2(xml, token) : _stampTest.timbrarXMLV2(xml, token);
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
        StringArray uuidsList = new StringArray();
        uuidsList.setString(uuids);
        
        StringArrayTest uuidsListTest = new StringArrayTest();
        uuidsListTest.setString(uuids);

        return _isProduction ?
                _cancelProd.cancelarCSD(csdB64, keyB64, password, rfcEmisor, uuidsList, token) : _cancelTest.cancelarCSD(csdB64, keyB64, password, rfcEmisor, uuidsListTest, token);
    }
    
    private class StringArray extends CancelProd.ArrayOfString {
        public StringArray() {
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




