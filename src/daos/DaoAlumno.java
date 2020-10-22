/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Alumno;
import interfaces.InterfazDaoAlumno;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class DaoAlumno extends Dao implements InterfazDaoAlumno{

    @Override
    public Alumno buscarAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> buscarProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAlumno(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
