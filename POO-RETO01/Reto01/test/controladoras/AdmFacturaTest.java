/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

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
        System.out.println("La Fecha no debe estar vacia");
    }

    @Test
    public void siIngresoMontoVentamenorIgualaCeroDebeDarError(){
        assertFalse(admFactura.verificarMontoVentaMayorCero(0.00));
        System.out.println("El montoVenta debe ser mayor a Cero");
        assertFalse(admFactura.verificarMontoVentaMayorCero(-1.00));
        System.out.println("El montoVenta no debe ser menor a Cero");
    }

}
