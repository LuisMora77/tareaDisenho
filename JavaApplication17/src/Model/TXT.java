/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DTO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Monserrath
 */
public class TXT implements IPersistencia{

    @Override
    public void escribir(DTO datos) {
        try{
            BufferedWriter archivo = new BufferedWriter(new FileWriter("bitacora.txt"));
            String timeLog = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
            archivo.write("Fecha de Peticion: " + timeLog);
            archivo.newLine();
            archivo.write("Frase original: " + datos.getFrase());
            archivo.newLine();
            archivo.write("Resultados: ");
            archivo.newLine();
            archivo.newLine();
            for(int x = 0; x < datos.getTipoAlgoritmo().size(); x++){
                archivo.write("\t" + "Metodo: " + datos.getTipoAlgoritmo().get(x));
                archivo.newLine();
                archivo.write("\t" + "Forma: " + datos.getTipoSalida().get(x));
                archivo.newLine();
                archivo.newLine();
            }
            archivo.flush();
            archivo.close();
        }
        catch(Exception e){
            System.out.println("Se encontro un error");
        }
    }
}
