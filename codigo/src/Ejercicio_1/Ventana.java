package Ejercicio_1;

public class Ventana extends Dispositivo{
    public Ventana(){};
    public Ventana(String id, TActivador activador){
        this.id = id;
        this.activador = activador;
        this.contrasena = "N/A";
        activada = false;
    };
    public Ventana(String id, TActivador activador, String contrasena){
        this.id = id;
        this.activador = activador;
        this.contrasena = contrasena;
        activada = false;
    };

    @Override
    public String toString() {
        return "Ventana{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
