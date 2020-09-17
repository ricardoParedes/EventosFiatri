/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author JORGEVQZ
 */
public class Cliente {
    private int idCliente;
    private String nombresCliente;
    private String apellidosCliente;
    private String cedulaRucCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private String emailCliente;
    
    public Cliente(){}

    public Cliente(int idCliente, String nombresCliente, String apellidosCliente, String cedulaRucCliente, String direccionCliente, String telefonoCliente, String nombreCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.cedulaRucCliente = cedulaRucCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getCedulaRucCliente() {
        return cedulaRucCliente;
    }

    public void setCedulaRucCliente(String cedulaRucCliente) {
        this.cedulaRucCliente = cedulaRucCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

   
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    
    
}
