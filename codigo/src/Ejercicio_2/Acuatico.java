package Ejercicio_2;

public abstract class Acuatico extends Mamifero{
    protected boolean tieneDorsal;
    
    public abstract void nadar();

    public abstract void setTieneDorsal(boolean respiraBajoAgua);
    public abstract boolean isTieneDorsal();
}
