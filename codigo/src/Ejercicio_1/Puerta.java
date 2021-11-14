package Ejercicio_1;

public class Puerta extends Dispositivo{
    public Puerta(){};
    public Puerta(String id, boolean activada, boolean activador){};

    @Override
    public String toString() {
        return "Puerta{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
