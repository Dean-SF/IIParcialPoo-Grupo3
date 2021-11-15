package Ejercicio_1;

public class Alarma extends Dispositivo{
    public Alarma(){};
    public Alarma(String id, TActivador activador){
        this.id = id;
        this.activador = activador;
        this.contrasena = "N/A";
        activada = false;
    };
    public Alarma(String id, TActivador activador, String contrasena){
        this.id = id;
        this.activador = activador;
        this.contrasena = contrasena;
        activada = false;
    };

    @Override
    public String toString() {
        return "Alarma{Nombre: "+id+", Activada: "+activada+
                ", Activador: "+activador+'}';
    }
}
