package Ejercicio_2;

public class Leon extends Terrestre{
    public Leon(){};
    public Leon(String id,int edad,boolean tienePesunna){
        this.edad = edad;
        this.id = id;
        this.tienePesunna = tienePesunna;
    };

    @Override
    public String toString() {
        return "Leon{Identificacion: "+id+", Edad: "+edad+
                ",Tiene pesunna: "+tienePesunna+'}';
    }

    @Override
    public void caminar() {
        System.out.println("El Leon '"+id+"' camino.");
    }

    @Override
    public void respirar() {
        System.out.println("El Leon '"+id+"' respiro.");
    }
}
