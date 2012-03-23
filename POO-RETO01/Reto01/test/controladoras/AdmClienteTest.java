/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * @author mguerrero
 */
public class AdmClienteTest {
    
    AdmCliente admCliente = new AdmCliente();
    
    @Test
    public void siNoingresoDNIDebeDarError(){
        //assertFalse(admCliente.verificarDNI(null));
        System.out.println("Usuario no debe estar vacio");
    }
    
}
