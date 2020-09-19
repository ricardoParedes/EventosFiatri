
package entidades;

public class Menu {
    private int idMenu;
    private int idPostre;
    private int idPlatoFuerte;
    private int idSorbete;
    private int idEntrada;
    private String nombreMenu;
    private int tiemposMenu;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdPostre() {
        return idPostre;
    }

    public void setIdPostre(int idPostre) {
        this.idPostre = idPostre;
    }

    public int getIdPlatoFuerte() {
        return idPlatoFuerte;
    }

    public void setIdPlatoFuerte(int idPlatoFuerte) {
        this.idPlatoFuerte = idPlatoFuerte;
    }

    public int getIdSorbete() {
        return idSorbete;
    }

    public void setIdSorbete(int idSorbete) {
        this.idSorbete = idSorbete;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public int getTiemposMenu() {
        return tiemposMenu;
    }

    public void setTiemposMenu(int tiemposMenu) {
        this.tiemposMenu = tiemposMenu;
    }

    public Menu(int idMenu, int idPostre, int idPlatoFuerte, int idSorbete, int idEntrada, String nombreMenu, int tiemposMenu) {
        this.idMenu = idMenu;
        this.idPostre = idPostre;
        this.idPlatoFuerte = idPlatoFuerte;
        this.idSorbete = idSorbete;
        this.idEntrada = idEntrada;
        this.nombreMenu = nombreMenu;
        this.tiemposMenu = tiemposMenu;
    }

    public Menu() {
    }
}
