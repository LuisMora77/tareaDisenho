/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Model;

import tareadisenho.Controller.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import tareadisenho.Controller.DTO;
import tareadisenho.GUI;

/**
 *
 * @author Luis
 */
public class TareaDisenho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        // TODO code application logic here
        
        GUI ventana = new GUI();
        controller cont = new controller();
        DTO mydto = new DTO();
        cont.predefinirAlfabeto();
        cont.cargarAlfabetos();
        cont.CargarAlgoritmos();
        //System.out.println(cont.getAlfabeto())
        ventana.setVisible(true);
        
        System.out.println("\n\nBienvenido/a al programa de codificacion y decodificacion\n\n");
        System.out.println("A continuacion se presentan las opciones disponibles:\n\n");
        
        
        
        System.out.println("Nombre del alfabeto que desea utilizar: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mydto.setNombreAlfabeto(br.readLine());
        System.out.println(mydto.getNombreAlfabeto());
        
        System.out.println("Ingrese la frase que desea convertir: ");
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
    }
    
}
