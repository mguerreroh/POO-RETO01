/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.String;

/**
 *
 * @author mguerrero
 */
public class AdmFacturaTest {
    
    AdmFactura admFactura = new AdmFactura();
    
    @Test
    public void siNoingresoDNIDebeDarError(){
        assertFalse(admFactura.verificarDNI(null));
        System.out.println("Usuario no debe estar vacio");
    }
    
    @Test 
    public void siIngresoDNISinValoresDebeDarError(){
        assertFalse(admFactura.verificarDNIVacio("    "));
        System.out.println("DNI no debe contener espacios en blanco");
    }
    
    @Test
    public void siNoingresoNumeroDebeDarError(){
        assertFalse(admFactura.verificarNumero(null));
        System.out.println("El Numero de Factura no debe estar vacio");
    }
    
    @Test
    public void siNoingresoFechaDebeDarError(){
        assertFalse(admFactura.verificarFecha(null));
        System.out.println("La Fecha no debe estar vacia");
    }
    
    @Test
    public void siNoingresoMontoVentaDebeDarError(){
        assertFalse(admFactura.verificarMontoVenta(null));
        System.out.println("El Monto de Venta no debe estar vacio");
    }

    @Test
    public void siIngresoMontoVentamenorIgualaCeroDebeDarError(){
        assertFalse(admFactura.verificarMontoVentaMayorCero(0.00));
        System.out.println("El montoVenta debe ser mayor a Cero");
        assertFalse(admFactura.verificarMontoVentaMayorCero(-1.00));
        System.out.println("El montoVenta no debe ser menor a Cero");
    }
    
    @Test
    public void siIngresaFechaErradaDebeDarError(){
        assertFalse(admFactura.verificarFechaReal("01-31-2012"));
        //assertTrue(admFactura.verificarFechaReal("01-81-2012"));
        System.out.println("La fecha es incorrecta");
    }
    
    @Test
    public void verificaFecha(){
        assertFalse(admFactura.validarFecha("2012-12-32"));
        System.out.println("La fecha es incorrecta");
    }
    
    @Test
    public void siFechaPerteneceAlMesIngresado(){
        assertFalse(admFactura.verificaFechaPerteneceMes("2012-12-32",8));
        System.out.println("La fecha de la factura no corresponde al mes ingresado");
    }

    @Test
    public void siFechaPerteneceAlAñoIngresado(){
        assertFalse(admFactura.verificaFechaPerteneceAño("2012-12-32",2015));
        System.out.println("La fecha de la factura no corresponde al año ingresado");
    }
    
    @Test
    public void siNumeroDeFacturaExisteDebeDarError(){
        assertFalse(admFactura.buscaFactura("001")==false);
        System.out.println("La factura ya existe, no debe registrar doble");
    }

}
