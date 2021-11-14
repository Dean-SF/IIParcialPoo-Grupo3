package Ejercicio_2;

public class Caballo extends Terrestre{
    public Caballo(){};
    public Caballo(String id,int edad,boolean tienePesunna){
        this.edad = edad;
        this.id = id;
        this.tienePesunna = tienePesunna;
    };

    @Override
    public String toString() {
        return "Caballo{Identificacion: "+id+", Edad: "+edad+
                ",Tiene pesunna: "+tienePesunna+'}';
    }

    @Override
    public void caminar() {
        System.out.println("El Caballo '"+id+"' camino.");
    }

    @Override
    public void respirar() {
        System.out.println("El Caballo '"+id+"' respiro.");
    }
}
