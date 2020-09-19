
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PostreDAO implements iOperaciones <Postre> {

    @Override
    public Boolean eliminar(Postre ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Postre ent) {
        Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarPostre(?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombrePostre());
        call.setString("descripcion", ent.getDescripcionPostre());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }    
        return exito;
    }

    @Override
    public Boolean modificar(Postre ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_actualizarPostre(?,?,?)}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.setInt("idPostre",ent.getIdPostre());
            call.setString("nombre", ent.getNombrePostre());
            call.setString("descripcion", ent.getDescripcionPostre());
            int ejecucion= call.executeUpdate();
            if(ejecucion>0){
                exito=true;
            }
                             
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return exito;          
    }

    @Override
    public ArrayList<Postre> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Postre> buscar(Postre ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
