package Ejercicio_2;

public abstract class Terrestre extends Mamifero{
    protected boolean tienePesunna;
    
    public abstract void caminar();

    public abstract void setTienePesunna(boolean tienePesunna);
    public abstract boolean isTienePesunna();
}
