/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Factura;

/**
 *
 * @author mguerrero
 */
public class AdmFactura {
    
    private ArrayList<Factura> dbFactura = new ArrayList<Factura>();
    
    private void simularTabla(){
        this.dbFactura.add(new Factura("dni"    , "numeroFactura", "01/05/2012", 100.00));
        this.dbFactura.add(new Factura("dni0953", "001"          , "01/05/2012", 100.00));
        this.dbFactura.add(new Factura("dni0610", "002"          , "01/05/2012", 100.00));
        this.dbFactura.add(new Factura("dni0610", "002"          , "01/05/2012", 100.00));
        this.dbFactura.add(new Factura("dni0953", "003"          , "01/05/2012", 100.00));
    }
    
    public boolean verificarDNI(String dni){
        if(dni != null) {
            return true;
        }
        return false;
    }
    
    public boolean verificarDNIVacio(String dni){
        if(dni.trim().length() != 0){
        //if(dni.equals("") != 0){
            return true;
        }
        return false;
    }

    public boolean verificarNumero(String numeroFactura){
        if(numeroFactura != null){
            return true;
        }
        return false;
    }

    public boolean verificarFecha(String fecha){
        if(fecha != null){
            return true;
        }
        return false;
    }
    
    public boolean verificarMontoVenta(String montoVenta){
        if(montoVenta != null){
            return true;
        }
        return false;
    }
    
    public boolean verificarMontoVentaMayorCero(Double montoVenta){
        if(montoVenta > 0){
            return true;
        }
        return false;
    }
    
    public boolean verificarMontoVentaMayorCero1(Double montoVenta){
        if(montoVenta > 0){
            return true;
        }
        return false;
    }
    public boolean verificarMontoVentaMayorCero2(Double montoVenta){
        if(montoVenta > 0){
            return true;
        }
        return false;
    }
}
