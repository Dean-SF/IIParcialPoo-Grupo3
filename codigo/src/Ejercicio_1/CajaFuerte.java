package Ejercicio_1;

public class CajaFuerte extends Dispositivo{
    public CajaFuerte(){};
    public CajaFuerte(String id, TActivador activador){
        this.id = id;
        this.activador = activador;
        this.contrasena = "N/A";
        activada = false;
    };
    public CajaFuerte(String id, TActivador activador, String contrasena){
        this.id = id;
        this.activador = activador;
        this.contrasena = contrasena;
        activada = false;
    };

    @Override
    public String toString() {
        return "CajaFuerte{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
