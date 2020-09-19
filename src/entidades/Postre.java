
package entidades;

public class Postre {
   private int idPostre;
   private String nombrePostre;
   private String descripcionPostre;

    public Postre() {
    }

    public Postre(int idPostre, String nombrePostre, String descripcionPostre) {
        this.idPostre = idPostre;
        this.nombrePostre = nombrePostre;
        this.descripcionPostre = descripcionPostre;
    }

    public int getIdPostre() {
        return idPostre;
    }

    public void setIdPostre(int idPostre) {
        this.idPostre = idPostre;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public void setNombrePostre(String nombrePostre) {
        this.nombrePostre = nombrePostre;
    }

    public String getDescripcionPostre() {
        return descripcionPostre;
    }

    public void setDescripcionPostre(String descripcionPostre) {
        this.descripcionPostre = descripcionPostre;
    }
   
}
