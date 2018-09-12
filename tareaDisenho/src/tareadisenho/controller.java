/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho;

/**
 *
 * @author Luis
 */
public class controller {
    private String alfabeto;

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    public void predefinirAlfabeto(){
        setAlfabeto("abcdefghijklmnopqrstuvwxyz");
    }
    
    
}
