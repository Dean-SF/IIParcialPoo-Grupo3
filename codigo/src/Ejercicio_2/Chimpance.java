package Ejercicio_2;

public class Chimpance extends Terrestre{
    public Chimpance(){};
    public Chimpance(String id,int edad,boolean tienePesunna){
        this.edad = edad;
        this.id = id;
        this.tienePesunna = tienePesunna;
    };

    @Override
    public String toString() {
        return "Chimpance{Identificacion: "+id+", Edad: "+edad+
                ",Tiene pesunna: "+tienePesunna+'}';
    }

    @Override
    public void caminar() {
        System.out.println("El Chimpanse '"+id+"' camino.");
    }

    @Override
    public void respirar() {
        System.out.println("El Chimpanse '"+id+"' respiro.");
    }
}
