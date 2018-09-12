/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;

/**
 *
 * @author Monserrath
 */
public class XML implements IPersistencia{

    @Override
    public void escribir(DTO datos) {
        System.out.println("Aca se creara un XML como salida");
    }
    
}
