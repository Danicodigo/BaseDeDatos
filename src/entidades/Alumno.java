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
public class Alumno {
    private String nombre;
    private Grupo grupo;
    private ArrayList<Parte>partes;
    
    public Alumno(String nombre,Grupo grupo){
        this.nombre=nombre;
        this.grupo=grupo;
        this.partes=new ArrayList<Parte>();
    }
    public Alumno(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }
    
}
