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
    public boolean activador(int num, String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activador(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activador(String codgio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean activador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
