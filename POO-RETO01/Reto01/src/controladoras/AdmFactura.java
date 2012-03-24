/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelos.Factura;
import java.lang.String;
import java.text.ParseException;

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
    /******
    public boolean esFecha(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(fechax);
            System.out.println("11111111" + fecha);
        } catch (Exception e) {
            System.out.println("222222");
            return true;
        }
        return false;
    }
    //******
    public boolean verificarF_echaReal(String fecha){
        if (esFecha(fecha)){
            System.out.println("33333");
            return true;
        }
        System.out.println("44444");
        return false;
        //******
    }
    */
    public boolean verificarFechaReal(String fecha){
        int xDia=0, xMes=0,xAno=0;
        String div1="", div2="";
        xDia=Integer.parseInt(fecha.substring(1,2));
        xMes=Integer.parseInt(fecha.substring(4,5));
        xAno=Integer.parseInt(fecha.substring(7,10));
        div1=fecha.substring(2);
        div2=fecha.substring(5);
        System.out.println("Dia:" + xDia + ", Mes:" + xMes + ", Año:" + xAno);
        //SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        //df.parse("01/01/2006");
        return false;
    }
    
    //**
    public boolean validarFecha(String fecha) {

    if (fecha == null)
    return false;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    if (fecha.trim().length() != dateFormat.toPattern().length())
    return false;
    dateFormat.setLenient(false);
    try {
        dateFormat.parse(fecha.trim());
    }
    catch (ParseException pe) {
        return false;
    }
    return true;
    }
    //**
}
