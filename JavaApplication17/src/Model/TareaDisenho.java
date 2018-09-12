/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho;

import javax.swing.JFrame;

/**
 *
 * @author Luis
 */
public class TareaDisenho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GUI ventana = new GUI();
        controller cont = new controller();
        //System.out.println(cont.getAlfabeto());
        
        ventana.setVisible(true);
    }
    
}
