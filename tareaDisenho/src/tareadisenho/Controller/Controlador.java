/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadisenho.Controller;

import java.util.Collection;
import tareadisenho.Controller.DTO;
import tareadisenho.Model.IPersistencia;

/**
 *
 * @author Luis
 */
public class Controlador  {
    private String alfabeto;

    public String getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    public void predefinirAlfabeto(){
        setAlfabeto("abcdefghijklmnopqrstuvwxyz");
        System.out.println("Clase Controller, metodo PredefinirAlfabeto. Solicita el alfabeto (default) al controlador");
    }
    
    public void cargarAlfabetos(){
        System.out.println("Clase Controller, metodo CargarAlfabetos. Carga el alfabeto (default) al controlador");
    }
    
    public void procesarPeticion(DTO datos){
        System.out.println("Clase Controller, metodo procesarPeticion. Procesa una peticion de procesamiento por parte de un usuario");
        System.out.println("    - Valida los datos");
        validar(datos);
        System.out.println("    - Ejecuta los algoritmos");
        ejecutarAlgoritmos(datos);
        System.out.println("    - Guarda la bitácora");
        escribir(datos);
        System.out.println("    - Termina de procesar la petición y regresa los datos");
    }
    
    public void agregarAlfabeto(DTO datos){}
    public void actualizarAlfabeto(DTO datos){}
    
    public void validar(DTO datos){
        System.out.println("Clase Controller, metodo Validar. Le solicita al alfabeto que valide una frase para luego poder ejecutar los algoritmos");
    }
    
    public void CargarAlgoritmos(){
        System.out.println("Clase Controller, metodo CargarAlgoritmos. Le regresa a la vista el nombre de aquellos algoritmos disponibles");
    }
    
    public void ejecutarAlgoritmos(DTO datos){
        System.out.println("Clase Controller, metodo EjecutarAlgoritmos. Llama a los algoritmos de codificación o descodificación");
        if(datos.isModo() == false){
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                datos.getTipoAlgoritmo().get(x).codificar(datos);
            }
        }
        else{
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                datos.getTipoAlgoritmo().get(x).decodificar(datos);
            }
        }
    }
    
    public void escribir(DTO datos){
        System.out.println("Clase Controller, metodo Escribir. Solicita la generación y guardado de las bitácoras respectivas");
        for(int x = 0; x < datos.getTipoSalida().size(); x++){
           datos.getTipoSalida().get(x).escribir(datos);
        }
    }
    
}
