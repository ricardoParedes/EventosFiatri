/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;


public interface iOperaciones <C> {
    public Boolean eliminar(C ent);
    public Boolean registrar(C ent);
    public Boolean modificar(C ent);
    public ArrayList<C> listarTodos();
    public ArrayList<C> buscar(C ent);
    
    
    
}
