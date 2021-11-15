package Ejercicio_1;

public class Puerta extends Dispositivo{
    public Puerta(){};
    public Puerta(String id, TActivador activador){
        this.id = id;
        this.activador = activador;
        this.contrasena = "N/A";
        activada = false;
    };
    public Puerta(String id, TActivador activador, String contrasena){
        this.id = id;
        this.activador = activador;
        this.contrasena = contrasena;
        activada = false;
    };

    @Override
    public String toString() {
        return "Puerta{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
