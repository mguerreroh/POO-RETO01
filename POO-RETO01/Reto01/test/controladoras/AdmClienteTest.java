/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * @author mguerrero
 */
public class AdmClienteTest {
    
    ArrayList<Cliente> dbCliente;
    AdmCliente admCliente = new AdmCliente(dbCliente);
    
    
    @Test
    public void siNoingresoDNIDebeDarError(){
        //assertFalse(admCliente.verificarDNI(null));
        System.out.println("Usuario no debe estar vacio");
    }
    
    @Test
    public void siNoEncuentraDNIMuestraError(){
        assertFalse(admCliente.buscaCliente("dni9999"));
        System.out.println("No se encontró el DNI");
    }
    
    @Test
    public void siEncuentraDNIMuestraMensajes(){
        assertTrue(admCliente.buscaCliente("dni0101"));
        System.out.println("Se encontró el DNI");
    }
    
    @Test
    public void siEncuentraNombreApellidoDuplicado(){
        assertTrue(admCliente.buscaNombreApellidoDuplicado("Alvaro", "Giron"));
        System.out.println("Este cliente ya se encuentra en Clientes");
    }
    
    @Test 
    public void siNoEncuentraNombreApellidoDuplicado(){
        assertFalse(admCliente.buscaNombreApellidoDuplicado("Alvaro", "Torres"));
        System.out.println("Cliente no esta registrado");
    }

}
