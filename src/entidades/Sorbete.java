package entidades;

public class Sorbete {
private int idSorbete;
private String nombreSorbete;
private String descripcionSorbete;

    public int getIdSorbete() {
        return idSorbete;
    }

    public void setIdSorbete(int idSorbete) {
        this.idSorbete = idSorbete;
    }

    public String getNombreSorbete() {
        return nombreSorbete;
    }

    public void setNombreSorbete(String nombreSorbete) {
        this.nombreSorbete = nombreSorbete;
    }

    public String getDescripcionSorbete() {
        return descripcionSorbete;
    }

    public void setDescripcionSorbete(String descripcionSorbete) {
        this.descripcionSorbete = descripcionSorbete;
    }

    public Sorbete(int idSorbete, String nombreSorbete, String descripcionSorbete) {
        this.idSorbete = idSorbete;
        this.nombreSorbete = nombreSorbete;
        this.descripcionSorbete = descripcionSorbete;
    }

    public Sorbete() {
    }

}
