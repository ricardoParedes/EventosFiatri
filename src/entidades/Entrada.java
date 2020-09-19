
package entidades;

public class Entrada {
    private int idEntrada;
    private String nombreEntrada;
    private String descripcionEntrada;

    public Entrada() {
    }

    public Entrada(int idEntrada, String nombreEntrada, String descripcionEntrada) {
        this.idEntrada = idEntrada;
        this.nombreEntrada = nombreEntrada;
        this.descripcionEntrada = descripcionEntrada;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getNombreEntrada() {
        return nombreEntrada;
    }

    public void setNombreEntrada(String nombreEntrada) {
        this.nombreEntrada = nombreEntrada;
    }

    public String getDescripcionEntrada() {
        return descripcionEntrada;
    }

    public void setDescripcionEntrada(String descripcionEntrada) {
        this.descripcionEntrada = descripcionEntrada;
    }
    
}
