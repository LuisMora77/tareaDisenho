/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Model;

import java.util.Collection;
import tareadisenho.Controller.DTO;

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
        System.out.println("alfabeto predefinido con exito");
    }
    
    public void cargarAlfabetos(){
        System.out.println("alfabetos cargados exitosamente");
    }
    
    public void procesarPeticion(DTO datos){
        
        
    
    }
    
    public void agregarAlfabeto(DTO datos){}
    public void actualizarAlfabeto(DTO datos){}
    
    public void validar(DTO datos){
    
    }
    
    public void CargarAlgoritmos(){
        System.out.println("algoritmos cargados exitosamente");
    }
    
    public void ejecutarAlgoritmos(){
        System.out.println("ejecutando algoritmo(s) requerido(s)");
    }
    
    public void escribir(DTO datos){
    TXT escritor = new TXT();
    escritor.escribir(datos);
    System.out.println("txt escrito exitosamente");
    }
    
}
