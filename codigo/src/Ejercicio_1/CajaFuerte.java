package Ejercicio_1;

public class CajaFuerte extends Dispositivo{
    public CajaFuerte(){};
    public CajaFuerte(String id, boolean activada, boolean activador){};

    @Override
    public String toString() {
        return "CajaFuerte{Nombre: "+id+", Activada: "+activada+
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

    @Override
    public boolean activador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
