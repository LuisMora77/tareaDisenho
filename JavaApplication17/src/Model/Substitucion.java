/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;

/**
 *
 * @author Usuario
 */
public class Substitucion extends Algoritmo {
    
    @Override
    public void codificar(DTO dto){
        System.out.println("Clase Transposicion, método Codificar. Codifica una frase según los datos que recibe en el dto");
    }
    @Override
    protected void decodificar(DTO dto){
        System.out.println("Clase Transposicion, método Decodificar. Decodifica una frase según los datos que recibe en el dto");
    }
    
}
