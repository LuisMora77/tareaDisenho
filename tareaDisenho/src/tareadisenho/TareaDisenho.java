/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho;

import tareadisenho.Controller.Controlador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
        Controlador cont = new Controlador();
        DTO mydto = new DTO();
        cont.predefinirAlfabeto(mydto);
        cont.cargarAlfabetos();
        cont.CargarAlgoritmos();
        //System.out.println(cont.getAlfabeto())
        ventana.setVisible(true);
        
        ArrayList algoritmos = new ArrayList();
        ArrayList salidas = new ArrayList();
        
        
        
        System.out.println("\n\nBienvenido/a al programa de codificacion y decodificacion\n");
        System.out.println("A continuacion se presentan las opciones disponibles:\n");
        
        
        
        System.out.println("Nombre del alfabeto que desea utilizar: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mydto.setNombreAlfabeto(br.readLine());
        
        System.out.println("Ingrese la frase que desea convertir: ");
        mydto.setFrase(br.readLine());
        System.out.println("Ingrese el algoritmo que desea aplicar: ");
 
        
        
        
        
        
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
