/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Model;

import tareadisenho.Controller.DTO;

/**
 *
 * @author Luis
 */
public class Telefonico extends Algoritmo{
    
     @Override
    public void codificar(DTO dto){
        System.out.println("Clase Telefonico, método Codificar. Codifica una frase según los datos que recibe en el dto");
    }
    @Override
    protected void decodificar(DTO dto){
        System.out.println("Clase Telefonico, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
    }
}
