/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alfabeto implements IValidable {
    String nombre;
    ArrayList<String> alfabeto;
    
    public boolean validar (String frase){
        System.out.println("Clase Alfabeto, método Validar. Se verifica que la frase ingresada por el usuario sea compatible con el alfabeto activo");
        return true;
    }
}
