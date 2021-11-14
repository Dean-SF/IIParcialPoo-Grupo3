package Ejercicio_1;

public class Ventana extends Dispositivo{
    public Ventana(){};
    public Ventana(String id, boolean activada, boolean activador){};

    @Override
    public String toString() {
        return "Ventana{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
    
    @Override
    public void setActivada(boolean activada) {
        this.activada = activada;
    }
    @Override
    public void setActivador(boolean activador) {
        this.activador = activador;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean isActivada() {
        return activada;
    }
    @Override
    public boolean isActivador() {
        return activador;
    }
    @Override
    public String getId() {
        return id;
    } 
}
