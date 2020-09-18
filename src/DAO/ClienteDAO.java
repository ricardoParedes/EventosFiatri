
package DAO;

import entidades.Cliente;
import entidades.iOperaciones;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO implements iOperaciones <Cliente> {

    @Override
    public Boolean eliminar(Cliente ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean registrar(Cliente ent) {
        Boolean exito=false;
        try{
            Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_registrarCliente(?,?,?,?,?,?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombresCliente());
        call.setString("apellido", ent.getApellidosCliente());
        call.setString("cedula", ent.getCedulaRucCliente());
        call.setString("direccion", ent.getCedulaRucCliente());
        call.setString("telefono", ent.getTelefonoCliente());
        call.setString("email", ent.getEmailCliente());
        exito=true;
        call.executeQuery();
        cn.close();
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return exito;
        
    }

    @Override
    public Boolean modificar(Cliente ent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> buscar(Cliente ent) {
        ArrayList<Cliente> lista = new ArrayList();
        try{   
        Connection cn = new ConexionDAO().getConnection();
        String procedimientoAlmacenado= "{call sp_buscarCliente(?)}"; 
        CallableStatement call= cn.prepareCall(procedimientoAlmacenado);
        call.setString("nombre", ent.getNombresCliente());
        ResultSet rs=call.executeQuery();
            while(rs.next()){
                Cliente objCliente= new Cliente();
                objCliente.setIdCliente(rs.getInt("IDCLIENTE"));
                objCliente.setNombresCliente(rs.getString("NOMBRESCLIENTE"));
                objCliente.setApellidosCliente(rs.getString("APELLIDOSCLIENTE"));
                objCliente.setCedulaRucCliente(rs.getString("CEDULARUCCLIENTE"));
                objCliente.setDireccionCliente(rs.getString("DIRECCIONCLIENTE"));
                objCliente.setTelefonoCliente(rs.getString("TELEFONOCLIENTE"));
                objCliente.setEmailCliente(rs.getString("EMAILCLIENTE"));
                lista.add(objCliente);
            }
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "no se pudo establecer la conexion" + ex.getMessage(),"Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
    return lista;
    }
}