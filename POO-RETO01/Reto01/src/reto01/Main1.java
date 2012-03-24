/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reto01;

import controladoras.AdmFactura;
import java.util.ArrayList;
import modelos.Factura;
import controladoras.AdmFactura;

/**
 * @author mguerrero
 */
public class Main1 {
    
    private static ArrayList<Factura> dbFactura = new ArrayList<Factura>();
    
    //private static ArrayList<Factura> dbFactura;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        //dbFactura.add(new Factura("dni"    , "numeroFactura", "01/05/2012", 100.00));
        //dbFactura.add(new Factura("dni0953", "001"          , "01/05/2012", 100.00));
        //dbFactura.add(new Factura("dni0610", "002"          , "01/05/2012", 100.00));
        //dbFactura.add(new Factura("dni0610", "002"          , "01/05/2012", 100.00));
        //dbFactura.add(new Factura("dni0953", "003"          , "01/05/2012", 100.00));
        
        System.out.println(Main1.carga_factura("dni"    , "numeroFactura", "01/05/2012", 100.00));
        System.out.println(Main1.carga_factura("dni0953", "001"          , "01/05/2012", 100.00));
        System.out.println(Main1.carga_factura("dni0610", "002"          , "01/05/2012", 100.00));
        System.out.println(Main1.carga_factura("dni0610", "002"          , "01/05/2012", 100.00));
        System.out.println(Main1.carga_factura("dni0953", "003"          , "01/05/2012", 100.00));
        for(Factura unaFactura:dbFactura){
            System.out.println(unaFactura.getNumeroFactura());
        }
    }
    
    public static String carga_factura(String dni, String numeroFactura, String fecha, Double montoVenta){
        String xMensaje="Se adiciono registro sin inconvenientes";
        Boolean valDNI, valFactura, valFecha, valMontoVenta;
        valDNI = true;
        valFactura = true;
        valFecha = true;
        valMontoVenta = true;
        if (valDNI && valFactura && valFecha && valMontoVenta){
            dbFactura.add(new Factura(dni, numeroFactura, fecha, montoVenta));
        }
        return xMensaje;
    }
    
    public boolean validarDNI(String dni){
        boolean validar=true;
        validar=AdmFactura.verificarDNI(dni);
        if (validar != false){
            validar=AdmFactura.verificarDNIVacio(dni);
        }
        return validar;
    }

    
}
