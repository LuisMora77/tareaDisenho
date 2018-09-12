/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproyecto;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DTO {
    String nombre;
    ArrayList<String> alfabeto;
    String frase;
    boolean modo;
    ArrayList<String> tipoAlgoritmo;
    ArrayList<String> tipoSalida;
    ArrayList<String> resultados;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }
    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public boolean isModo() {
        return modo;
    }
    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public ArrayList<String> getTipoAlgoritmo() {
        return tipoAlgoritmo;
    }
    public void setTipoAlgoritmo(ArrayList<String> tipoAlgoritmo) {
        this.tipoAlgoritmo = tipoAlgoritmo;
    }

    public ArrayList<String> getTipoSalida() {
        return tipoSalida;
    }
    public void setTipoSalida(ArrayList<String> tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }
    public void setResultados(ArrayList<String> resultados) {
        this.resultados = resultados;
    }     
}
