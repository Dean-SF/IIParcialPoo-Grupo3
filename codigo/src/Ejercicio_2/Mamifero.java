package Ejercicio_2;

public abstract class Mamifero {
    protected String id;
    protected int edad;
    
    public Mamifero(){}
    
    public abstract void respirar();
    
    public void setId(String id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }  
}
