/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Collection;
import Model.Alfabeto;

/**
 *
 * @author Luis
 */
public class Controlador  {
    private Alfabeto alfabetoActual;
    private DAOAlfabetos dbalfabetos;
    
    public Controlador(){
        this.dbalfabetos = new DAOAlfabetos();
    }
    
    public void predefinirAlfabeto(DTO dto){
        System.out.println("Clase Controller, metodo PredefinirAlfabeto. Solicita cargar el alfabeto al controlador");
        this.alfabetoActual = dbalfabetos.getAlfabeto(dto.getNombreAlfabeto());
    }
    
    public Collection cargarAlfabetos(){
        System.out.println("Clase Controller, metodo CargarAlfabetos. Solicita los nombres de los alfabetos disponibles");
        return dbalfabetos.getAlfabetos();
    }
    
    public void procesarPeticion(DTO datos){
        System.out.println("Clase Controller, metodo procesarPeticion. Procesa una peticion de procesamiento por parte de un usuario");
        System.out.println("    - Valida los datos");
        validar(datos);
        System.out.println("    - Ejecuta los algoritmos");
        ejecutarAlgoritmos(datos);
        System.out.println("    - Guarda la bitácora");
        escribirArchivo(datos);
        System.out.println("    - Termina de procesar la petición y regresa los datos");
    }
    
    public void agregarAlfabeto(DTO datos){}
    public void actualizarAlfabeto(DTO datos){}
    
    private boolean validar(DTO datos){
        System.out.println("Clase Controller, metodo Validar. Le solicita al alfabeto que valide una frase para luego poder ejecutar los algoritmos");
        return alfabetoActual.validar(datos.getFrase());
    }
    
    public void CargarAlgoritmos(){
        System.out.println("Clase Controller, metodo CargarAlgoritmos. Le regresa a la vista el nombre de aquellos algoritmos disponibles");
    }
    
    private void ejecutarAlgoritmos(DTO datos){
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
    
    private void escribirArchivo(DTO datos){
        System.out.println("Clase Controller, metodo Escribir. Solicita la generación y guardado de las bitácoras respectivas");
        for(int x = 0; x < datos.getTipoSalida().size(); x++){
           datos.getTipoSalida().get(x).escribir(datos);
        }
    }
    
}
