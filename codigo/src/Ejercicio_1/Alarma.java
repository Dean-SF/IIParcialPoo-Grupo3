package Ejercicio_1;

public class Alarma extends Dispositivo{
    public Alarma(){};
    public Alarma(String id, boolean activada, TActivador activador){};

    @Override
    public String toString() {
        return "Alarma{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
