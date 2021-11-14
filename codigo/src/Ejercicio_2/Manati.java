package Ejercicio_2;

public class Manati extends Acuatico{
    public Manati(){};
    public Manati(String id,int edad,boolean tieneDorsal){
        this.edad = edad;
        this.id = id;
        this.tieneDorsal = tieneDorsal;
    };

    @Override
    public String toString() {
        return "Manati{Identificacion: "+id+", Edad: "+edad+
                ",Tiene dorsal: "+tieneDorsal+'}';
    }

    @Override
    public void nadar() {
        System.out.println("El Manati '"+id+"' nado.");
    }

    @Override
    public void respirar() {
        System.out.println("El Manati '"+id+"' respiro.");
    }
}
