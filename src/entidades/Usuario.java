
package entidades;

public class Usuario {
    private int idUsuario;
    private String usuarioUsuario;
    private String contrasenaUsuario;
    private String tipoUsuario;

    public Usuario(){}

    public Usuario(int idUsuario, String usuarioUsuario, String contrasenaUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.usuarioUsuario = usuarioUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.tipoUsuario = tipoUsuario;
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioUsuario() {
        return usuarioUsuario;
    }

    public void setUsuarioUsuario(String usuarioUsuario) {
        this.usuarioUsuario = usuarioUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
    

    
    
}
