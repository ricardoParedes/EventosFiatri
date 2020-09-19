
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuDAO implements iOperaciones <Menu>{

    @Override
    public Boolean eliminar(Menu ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Menu ent) {
        Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarMenu(?,?,?,?,?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setInt("idPostre", ent.getIdPostre());
        call.setInt("idPlatoFuerte", ent.getIdPlatoFuerte());
        call.setInt("idSorbete", ent.getIdSorbete());
        call.setInt("idEntrada", ent.getIdEntrada());
        call.setString("nombre", ent.getNombreMenu());
        call.setInt("tiempo", ent.getTiemposMenu());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }    
        return exito;    }

    @Override
    public Boolean modificar(Menu ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
            String procedimientoAlmacenado= "{call sp_actualizarMenu(?,?,?)}"; 
            CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
            call.setInt("idMenu",ent.getIdMenu());
            call.setInt("idPostre", ent.getIdPostre());
            call.setInt("idPlatoFuerte", ent.getIdPlatoFuerte());
            call.setInt("idSorbete", ent.getIdSorbete());
            call.setInt("idEntrada", ent.getIdEntrada());
            call.setString("nombre", ent.getNombreMenu());
            call.setInt("tiempo", ent.getTiemposMenu());
            int ejecucion= call.executeUpdate();
            if(ejecucion>0){
                exito=true;
            }
                             
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return exito;   }

    @Override
    public ArrayList<Menu> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Menu> buscar(Menu ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
