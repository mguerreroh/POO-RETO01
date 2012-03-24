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
        this.dbCliente.add(new Cliente("dni"    , "nombre"   , "apellido", "tipoCliente", 5));
        this.dbCliente.add(new Cliente("dni0610", "Ricardo", "Giron", "Gold", 100));
        this.dbCliente.add(new Cliente("dni0953", "Marcelino", "Guerrero", "Normal", 10));
        this.dbCliente.add(new Cliente("dni0101", "Alvaro", "Giron", "Platinum", 200));
        this.dbCliente.add(new Cliente("dni0102", "Rodrigo", "Giron", "Normal", 10));
        this.dbCliente.add(new Cliente("dni0103", "Ricardo", "Guerrero", "Platinum", 250));
    }
    
    
    
    public boolean buscaCliente(String dni){
        
        boolean encuentra=false;        
       
        this.simularTabla();
        
        for(Cliente unCliente:dbCliente){
            if(unCliente.getDni().equals(dni)){
                encuentra = true;
                break;
            }
        }
        
        return encuentra;
   }

    public boolean buscaNombreApellidoDuplicado(String nombre, String apellido){
        boolean encuentra=false;
        this.simularTabla();
        for(Cliente unCliente:dbCliente){
            if(unCliente.getApellido().equals(apellido) && unCliente.getNombre().equals(nombre)){
                encuentra = true;
                break;
            }
        }
        
        return encuentra;
    }
    
}
