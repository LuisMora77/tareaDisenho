/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Controller;

import java.util.Collection;
import tareadisenho.Model.Alfabeto;

/**
 *
 * @author Luis
 */
public class DAOAlfabetos {
    
    public void actualizar(){
        System.out.println("Clase DAOAlfabetos, metodo Actualizar. Actualiza los datos de un alfabeto");
    }
    public void crear(){
        System.out.println("Clase DAOAlfabetos, metodo Crear. Crea un alfabeto");
    };
    
    public void eliminar(){
        System.out.println("Clase DAOAlfabetos, metodo Eliminar. Elimina un alfabeto");
    };
    
    private boolean validar(DTO datos){
        System.out.println("Clase DAOAlfabetos, metodo Validar. Valida que un nuevo alfabeto pueda ser guardado");
        return true;
    }
    
    public Collection getAlfabetos(){
        System.out.println("Clase DAOAlfabetos, metodo GetAlfabetos. Carga todos los nombres de alfabetos disponibles");
        return null;
    }
    
    public Alfabeto getAlfabeto(String nombre){
        System.out.println("Clase DAOAlfabetos, metodo GetAlfabeto. Carga el alfabeto con el que trabajará el usuario");
        return null;        
    }
}
