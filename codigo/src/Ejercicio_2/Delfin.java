package Ejercicio_2;

public class Delfin extends Acuatico{
    public Delfin(){};
    public Delfin(String id,int edad,boolean tieneDorsal){
        this.edad = edad;
        this.id = id;
        this.tieneDorsal = tieneDorsal;
    };

    @Override
    public String toString() {
        return "Delfin{Identificacion: "+id+", Edad: "+edad+
                ",Tiene dorsal: "+tieneDorsal+'}';
    }

    @Override
    public void nadar() {
        System.out.println("El Delfin '"+id+"' nado.");
    }

    @Override
    public void respirar() {
        System.out.println("El Delfin '"+id+"' respiro.");
    }
}
