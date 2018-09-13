/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import tareadisenho.GUI;

/**
 *
 * @author Luis
 */
public class TareaDisenho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // TODO code application logic here
        
        GUI ventana = new GUI();
        controller cont = new controller();
        cont.predefinirAlfabeto();
        cont.cargarAlfabetos();
        cont.CargarAlgoritmos();
        //System.out.println(cont.getAlfabeto());
        
        ventana.setVisible(true);
    }
    
}
