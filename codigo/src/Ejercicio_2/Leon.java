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
        System.out.println("El leon '"+id+"' camino.");
    }
    @Override
    public void respirar() {
        System.out.println("El leon '"+id+"' respiro.");
    }
    
    @Override
    public void setTienePesunna(boolean tienePesunna) {
        this.tienePesunna = tienePesunna;
    }
    @Override
    public boolean isTienePesunna() {
        return tienePesunna;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public int getEdad() {
        return edad;
    }
}
