/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public interface InterfazDaoAlumno {
   public Alumno buscarAlumno(int id);
   public ArrayList<Alumno>buscarProfesores();
   public boolean addAlumno(Alumno a);
}
