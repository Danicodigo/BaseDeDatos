/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Profesor;
import interfaces.InterfazDaoProfesor;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class DaoProfesor extends Dao implements InterfazDaoProfesor{

    @Override
    public Profesor buscarAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Profesor> buscarProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAlumno(Profesor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
