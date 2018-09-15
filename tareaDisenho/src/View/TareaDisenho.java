/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controlador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import Controller.DTO;
import Model.PDF;
import Model.Substitucion;
import Model.TXT;
import Model.Telefonico;
import Model.Transposicion;
import Model.XML;

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
        Boolean bandera = true;
        while(bandera){
            String entrada = br.readLine();
            switch (entrada){
                    case "Substitucion":
                        algoritmos.add(new Substitucion());
                        break;
                    case "Telefonico":
                        algoritmos.add(new Telefonico());
                        break;
                    case "Transposicion":
                        algoritmos.add(new Transposicion());
                        break;
                    case "n":
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opción inválida");
            }
            System.out.println("Desea pedir otro algoritmo (ingrese 'n' para No): ");
        }
        
        System.out.println("Ingrese el método de guardado a aplicar: ");
        bandera = true;
        while(bandera){
            String entrada = br.readLine();
            switch (entrada){
                    case "TXT":
                        salidas.add(new TXT());
                        break;
                    case "PDF":
                        salidas.add(new PDF());
                        break;
                    case "XML":
                        salidas.add(new XML());
                        break;
                    case "n":
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opción inválida");
            }
            System.out.println("Desea habilitar otro método de guardado (ingrese 'n' para No): ");
        }
        
        System.out.println("Desea codificar o descodificar: ");
        String entrada = br.readLine();
        switch (entrada){
            case "codificar":
                bandera = false;
                break;
            case "decodificar":
                bandera = true;
                break;
        }            
 
        
        mydto.setTipoAlgoritmo(algoritmos);
        mydto.setTipoSalida(salidas);
        mydto.setModo(bandera);
    
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        cont.predefinirAlfabeto(mydto);
        cont.procesarPeticion(mydto);

        System.out.println("");
        
        for (int i=0; i<mydto.getResultados().size(); i++){
            System.out.println(mydto.getResultados().get(i));
        }
    }
    
}
