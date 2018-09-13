/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Model;

import java.util.ArrayList;
import tareadisenho.Controller.IValidable;

/**
 *
 * @author Luis
 */
public class Alfabeto implements IValidable {
    
    String nombre;
    ArrayList<String> alfabeto;
    
    @Override
    public boolean validar (Object objeto){
        System.out.println("Clase Alfabeto, método Validar. Se verifica que la frase ingresada por el usuario sea compatible con el alfabeto activo");
        return true;
    }
    
}
