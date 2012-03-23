/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Cliente;

/**
 * @author mguerrero
 */
public class AdmCliente {
    
    private ArrayList<Cliente> dbCliente = new ArrayList<Cliente>();
    
    private void simularTabla(){
        this.dbCliente.add(new Cliente("dni"    , "nombre"   , "apellido"));
        this.dbCliente.add(new Cliente("dni0610", "Ricardo", "Giron"));
        this.dbCliente.add(new Cliente("dni0953", "Marcelino", "Guerrero"));
    }
}
