
package DAO;

import entidades.Usuario;
import entidades.iOperaciones;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO implements iOperaciones <Usuario>{

    public boolean accesoSistema(Usuario ent){
        ArrayList<Usuario> lista = new ArrayList<>();
        boolean existe= false;
        try{
           Connection cn = new ConexionDAO().getConnection();
           String procedimientoAlmacenado= "{call sp_accesoSistema(?,?,?)}"; 
           CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
           call.setString("usuario", ent.getUsuarioUsuario());
           call.setString("contrasena", ent.getContrasenaUsuario());
           call.setString("tipo", ent.getTipoUsuario());
           ResultSet rs=call.executeQuery();
           while(rs.next()){
            Usuario objUsuario= new Usuario();
            objUsuario.setUsuarioUsuario(rs.getString("USUARIOUSUARIO"));
            objUsuario.setContrasenaUsuario(rs.getString("CONTRASENAUSUARIO"));
            objUsuario.setTipoUsuario(rs.getString("TIPOUSUARIO"));
            lista.add(objUsuario);
            
           }
            if(lista.size()>0){        
                existe=true;
            }else{
            existe=false;
            }
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return existe;
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
