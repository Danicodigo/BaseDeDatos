/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entidades.Grupo;
import interfaces.InterfazDaoGrupo;
import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class DaoGrupo extends Dao implements InterfazDaoGrupo{

    @Override
    public Grupo buscarAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grupo> buscarProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAlumno(Grupo g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
