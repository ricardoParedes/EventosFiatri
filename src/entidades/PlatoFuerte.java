
package entidades;

public class PlatoFuerte {
    private int idPlatoFuerte;
    private String nombrePlatoFuerte;
    private String descripcionPlatoFuerte;

    public PlatoFuerte() {
    }

    public PlatoFuerte(int idPlatoFuerte, String nombrePlatoFuerte, String descripcionPlatoFuerte) {
        this.idPlatoFuerte = idPlatoFuerte;
        this.nombrePlatoFuerte = nombrePlatoFuerte;
        this.descripcionPlatoFuerte = descripcionPlatoFuerte;
    }

    public int getIdPlatoFuerte() {
        return idPlatoFuerte;
    }

    public void setIdPlatoFuerte(int idPlatoFuerte) {
        this.idPlatoFuerte = idPlatoFuerte;
    }

    public String getNombrePlatoFuerte() {
        return nombrePlatoFuerte;
    }

    public void setNombrePlatoFuerte(String nombrePlatoFuerte) {
        this.nombrePlatoFuerte = nombrePlatoFuerte;
    }

    public String getDescripcionPlatoFuerte() {
        return descripcionPlatoFuerte;
    }

    public void setDescripcionPlatoFuerte(String descripcionPlatoFuerte) {
        this.descripcionPlatoFuerte = descripcionPlatoFuerte;
    }
    
}
