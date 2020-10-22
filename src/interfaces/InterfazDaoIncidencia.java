/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import entidades.Incidencia;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public interface InterfazDaoIncidencia {
     public Incidencia buscarAlumno(int id);
   public ArrayList<Incidencia>buscarProfesores();
   public boolean addAlumno(Incidencia i);
}
