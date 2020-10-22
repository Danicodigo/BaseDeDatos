/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Parte;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public interface InterfazDaoParte {
   public Parte buscarAlumno(int id);
   public ArrayList<Parte>buscarProfesores();
   public boolean addAlumno(Parte p);
}
