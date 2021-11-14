package Ejercicio_1;

public class CajaFuerte extends Dispositivo{
    public CajaFuerte(){};
    public CajaFuerte(String id, boolean activada, boolean activador){};

    @Override
    public String toString() {
        return "CajaFuerte{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
