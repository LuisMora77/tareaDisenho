/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Monserrath
 */
public class DTO {
    private String nombreAlfabeto;
    private ArrayList<String> alfabeto;
    private String frase;
    private boolean modo;
    private ArrayList<String> tipoAlgoritmo;
    private ArrayList<String> tipoSalida;
    private ArrayList<String> resultados;

    public DTO(String nombreAlfabeto, ArrayList<String> alfabeto, String frase, boolean modo, ArrayList<String> tipoAlgoritmo, ArrayList<String> tipoSalida, ArrayList<String> resultados) {
        this.nombreAlfabeto = nombreAlfabeto;
        this.alfabeto = alfabeto;
        this.frase = frase;
        this.modo = modo;
        this.tipoAlgoritmo = tipoAlgoritmo;
        this.tipoSalida = tipoSalida;
        this.resultados = resultados;
    }

    public String getNombreAlfabeto() {
        return nombreAlfabeto;
    }

    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }

    public String getFrase() {
        return frase;
    }

    public boolean isModo() {
        return modo;
    }

    public ArrayList<String> getTipoAlgoritmo() {
        return tipoAlgoritmo;
    }

    public ArrayList<String> getTipoSalida() {
        return tipoSalida;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }

    public void setNombreAlfabeto(String nombreAlfabeto) {
        this.nombreAlfabeto = nombreAlfabeto;
    }

    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public void setTipoAlgoritmo(ArrayList<String> tipoAlgoritmo) {
        this.tipoAlgoritmo = tipoAlgoritmo;
    }

    public void setTipoSalida(ArrayList<String> tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    public void setResultados(ArrayList<String> resultados) {
        this.resultados = resultados;
    }
    
}