package Ejercicio_2;

public abstract class Mamifero {
    protected String id;
    protected int edad;
    
    public Mamifero(){}
    
    public abstract void respirar();

    public abstract void setId(String id);
    public abstract void setEdad(int edad);

    public abstract String getId();
    public abstract int getEdad();
}
