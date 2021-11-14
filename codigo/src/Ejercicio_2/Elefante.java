package Ejercicio_2;

public class Elefante extends Terrestre{
    public Elefante(){};
    public Elefante(String id,int edad,boolean tienePesunna){
        this.edad = edad;
        this.id = id;
        this.tienePesunna = tienePesunna;
    };

    @Override
    public String toString() {
        return "Elefante{Identificacion: "+id+", Edad: "+edad+
                ",Tiene pesunna: "+tienePesunna+'}';
    }

    @Override
    public void caminar() {
        System.out.println("El Elefante '"+id+"' camino.");
    }

    @Override
    public void respirar() {
        System.out.println("El Elefante '"+id+"' respiro.");
    }
}
