package Ejercicio_2;

public abstract class Acuatico extends Mamifero{
    protected boolean tieneDorsal;
    
    public abstract void nadar();
    public void setTieneDorsal(boolean tieneDorsal) {
        this.tieneDorsal = tieneDorsal;
    }
    public boolean isTieneDorsal() {
        return tieneDorsal;
    }
}
