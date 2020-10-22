/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Grupo;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public interface InterfazDaoGrupo {
     public Grupo buscarAlumno(int id);
   public ArrayList<Grupo>buscarProfesores();
   public boolean addAlumno(Grupo g);
}
