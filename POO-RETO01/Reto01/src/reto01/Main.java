/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reto01;

import controladoras.AdmCliente;
import java.util.ArrayList;
import modelos.Cliente;
import vistas.Leeme;

/**
 * @author mguerrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Codigo de prueba
   
        Leeme miLeeme = new Leeme(); 
        miLeeme.show();
        
        
        ArrayList<Cliente> dbCliente = new ArrayList<Cliente>();
        
        dbCliente.add(new Cliente("dni"    , "nombre"   , "apellido", "tipoCliente", 5));
        dbCliente.add(new Cliente("dni0610", "Ricardo", "Giron", "Gold", 100));
        dbCliente.add(new Cliente("dni0953", "Marcelino", "Guerrero", "Normal", 10));
        dbCliente.add(new Cliente("dni0101", "Alvaro", "Giron", "Platinum", 200));
        dbCliente.add(new Cliente("dni0102", "Rodrigo", "Giron", "Normal", 10));
        dbCliente.add(new Cliente("dni0103", "Ricardo", "Guerrero", "Platinum", 250));
        
        AdmCliente objAdmCliente = new AdmCliente(dbCliente);
        if(objAdmCliente.buscaCliente("dni9999")){
            objAdmCliente.DatosClienteBuscado("dni0101");
            System.out.println(objAdmCliente.getObjClienteEncontrado().getNombre());
            System.out.println(objAdmCliente.getObjClienteEncontrado().getApellido());
            
        } else
            System.out.println("No se encontró DNI");
            
        
        
        
    }
}
