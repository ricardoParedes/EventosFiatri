
package DAO;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;

public class SorbeteDAO implements iOperaciones <Sorbete>{

    @Override
    public Boolean eliminar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Sorbete ent) {
         Boolean exito=false;
        try{
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarSorbete(?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombreSorbete());
        call.setString("descripcion", ent.getDescripcionSorbete());
        
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }    
        return exito;    }

    @Override
    public Boolean modificar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Sorbete> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Sorbete> buscar(Sorbete ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
