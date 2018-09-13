/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Controller;

import java.util.Collection;

/**
 *
 * @author Luis
 */
public class DAOAlfabetos {
    
    public void actualizar(){
        System.out.println("datos actualizados");
    }
    public void crear(){
    System.out.println("datos creados");
    };
    
    public void insertar(){
    System.out.println("datos instertados");
    }
    
    public void eliminar(){
    System.out.println("datos eliminados");
    };
    
    public boolean validar(DTO datos){
        System.out.println("datos validados correctamente");
        return true;
    }
    /*
    public Collection getAlfabetos(){
        System.out.println("alfabetos obtenidos con exito");
        return coleccion;
    }
    */
}
