package Ejercicio_2;

public abstract class Terrestre extends Mamifero{
    protected boolean tienePesunna;
    
    public abstract void caminar();
    
    public void setTienePesunna(boolean tienePesunna) {
        this.tienePesunna = tienePesunna;
    }
    public boolean isTienePesunna() {
        return tienePesunna;
    }
}
