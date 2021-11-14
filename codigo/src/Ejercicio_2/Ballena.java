package Ejercicio_2;

public class Ballena extends Acuatico{
    public Ballena(){};
    public Ballena(String id,int edad,boolean tieneDorsal){
        this.edad = edad;
        this.id = id;
        this.tieneDorsal = tieneDorsal;
    };

    @Override
    public String toString() {
        return "Ballena{Identificacion: "+id+", Edad: "+edad+
                ",Tiene dorsal: "+tieneDorsal+'}';
    }

    @Override
    public void nadar() {
        System.out.println("La Ballena '"+id+"' nado.");
    }

    @Override
    public void respirar() {
        System.out.println("La Ballena '"+id+"' respiro.");
    }
}
