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
    static Integer MES=5;
    static Integer ANHO=2012;
    
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
        
        System.out.println(Main1.carga_factura("dni0000", "000", "2012/05/01", 100.00));
        System.out.println(Main1.carga_factura("dni0953", "001", "2012/05/01", 100.00));
        System.out.println(Main1.carga_factura("dni0610", "002", "2013/05/01", 100.00));
        System.out.println(Main1.carga_factura("dni0610", "002", "2012/08/01", 100.00));
        System.out.println(Main1.carga_factura("dni0953", "003", "2012/05/01", 0.00));
        System.out.println("+-------------------------------------+");
        System.out.println("Datos Registrados");
        System.out.println("+-------------------------------------+");
        for(Factura unaFactura:dbFactura){
            System.out.print(unaFactura.getDni() + "          ");
            System.out.print(unaFactura.getNumeroFactura() + "          ");
            System.out.print(unaFactura.getFecha() + "          ");
            System.out.println(unaFactura.getMontoVenta() + "          ");
        }
    }
    
    public static String carga_factura(String dni, String numeroFactura, String fecha, Double montoVenta){
        String xMensaje="Se adiciono registro sin inconvenientes";
        boolean valDNI, valFactura, valFecha, valMontoVenta;
        valDNI = validarDNI(dni);
        valFactura = validarFactura(numeroFactura);
        valFecha = validarFecha(fecha);
        valMontoVenta = validarMontoVenta(montoVenta);
        if (valDNI && valFactura && valFecha && valMontoVenta){
            dbFactura.add(new Factura(dni, numeroFactura, fecha, montoVenta));
        } else {
            xMensaje="Verificar la informacion, registro no adicionado";
        }
        return xMensaje;
    }
    
    public static boolean validarDNI(String dni){
        boolean validar;
        validar=AdmFactura.verificarDNI(dni);
        if (validar != false){
            validar=AdmFactura.verificarDNIVacio(dni);
        }
        if (validar != false){
            validar=AdmFactura.verificarDNIVacio(dni);
        }
        return validar;
    }
    
    public static boolean validarFactura(String numeroFactura){
        boolean validar;
        validar=AdmFactura.verificaNumeroFactura(numeroFactura);
        if (validar != false){
            validar=AdmFactura.verificarNumeroFacturaVacio(numeroFactura);
        }
        if (validar != false){
            validar=buscaFactura(numeroFactura);
        }        
        return validar;
    }
    
    public static boolean validarFecha(String fecha){
        boolean validar;
        validar=AdmFactura.verificarFecha(fecha);
        if (validar != false){
            validar=AdmFactura.verificaFechaPerteneceMes(fecha, MES);
        }
        if (validar != false){
            validar=AdmFactura.verificaFechaPerteneceAnho(fecha, ANHO);
        }
        return validar;
    }
    
    public static boolean validarMontoVenta(Double MontoVenta){
        boolean validar;
        validar=AdmFactura.verificarMontoVenta(MontoVenta);
        if (validar != false){
            validar=AdmFactura.verificarMontoVentaMayorCero(MontoVenta);
        }
        return validar;
    }

    public static boolean buscaFactura(String numeroFactura){
        for(Factura unaFactura:dbFactura){
            if(unaFactura.getNumeroFactura().equals(numeroFactura)){
                return false;
            }
        }
        return true;
   }
}
