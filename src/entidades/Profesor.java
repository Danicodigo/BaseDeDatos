/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Profesor {
    private String nombre;
    private ArrayList<Parte>partes;
    private String descripcion;

    public Profesor(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.partes=new ArrayList<>();
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
