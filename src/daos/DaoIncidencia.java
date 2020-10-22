/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Incidencia;
import interfaces.InterfazDaoIncidencia;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class DaoIncidencia extends Dao implements InterfazDaoIncidencia{

    @Override
    public Incidencia buscarAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Incidencia> buscarProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAlumno(Incidencia i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
