/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaNegocio;

import DAO.ClienteDAO;
import entidades.Cliente;
import entidades.iOperaciones;
import java.util.ArrayList;

/**
 *
 * @author JORGEVQZ
 */
public class lnCliente implements iOperaciones<Cliente>{

    @Override
    public Boolean eliminar(Cliente ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Cliente ent) {
        return new ClienteDAO().registrar(ent);
    }

    @Override
    public Boolean modificar(Cliente ent) {
        return new ClienteDAO().modificar(ent);
    }

    @Override
    public ArrayList<Cliente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> buscar(Cliente ent) {
       return new ClienteDAO().buscar(ent);
    }
    
}
