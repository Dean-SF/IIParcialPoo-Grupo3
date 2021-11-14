package Ejercicio_1;

public class Ventana extends Dispositivo{
    public Ventana(){};
    public Ventana(String id, boolean activada, boolean activador){};

    @Override
    public String toString() {
        return "Ventana{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
