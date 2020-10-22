/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public interface InterfazDaoProfesor {
   public Profesor buscarAlumno(int id);
   public ArrayList<Profesor>buscarProfesores();
   public boolean addAlumno(Profesor p);
}
