package Ejercicio_1;

public abstract class Dispositivo implements Activador{
    protected boolean activada;
    protected boolean activador;
    protected String id;

    public abstract void setActivada(boolean activada);
    public abstract void setActivador(boolean activador);
    public abstract void setId(String id);
    public abstract boolean isActivada();
    public abstract boolean isActivador();
    public abstract String getId();
}
