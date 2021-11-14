package Ejercicio_1;

public abstract class Dispositivo implements Activador{
    protected boolean activada;
    protected boolean activador;
    protected String id;

    public void setActivada(boolean activada) {
        this.activada = activada;
    }
    public void setActivador(boolean activador) {
        this.activador = activador;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isActivada() {
        return activada;
    }
    public boolean isActivador() {
        return activador;
    }
    public String getId() {
        return id;
    } 
}
