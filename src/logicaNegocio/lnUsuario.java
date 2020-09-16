/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaNegocio;

import DAO.UsuarioDAO;
import entidades.Usuario;
import entidades.iOperaciones;
import java.util.ArrayList;

/**
 *
 * @author JORGEVQZ
 */
public class lnUsuario implements iOperaciones<Usuario>{
    
    public boolean accesoSistema(Usuario ent){
        return new UsuarioDAO().accesoSistema(ent);
    }

    @Override
    public Boolean eliminar(Usuario ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Usuario ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean modificar(Usuario ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> buscar(Usuario ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
