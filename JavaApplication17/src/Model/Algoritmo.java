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
public abstract class Algoritmo {
    
    protected void codificar(DTO dto){
        System.out.println("Clase Algoritmo, método Codificar. Básicamente, acá no debería entrar");
    }
    
    protected void decodificar(DTO dto){
        System.out.println("Clase Algoritmo, método Decodificar. Básicamente, acá no debería entrar");
    }
}
