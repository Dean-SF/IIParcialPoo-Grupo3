/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Esteban
 */
public class Caballo extends Terrestre{
    public Caballo(){};
    public Caballo(String id,int edad,boolean tienePesunna){
        this.edad = edad;
        this.id = id;
        this.tienePesunna = tienePesunna;
    };

    @Override
    public String toString() {
        return "Caballo{Identificacion: "+id+", Edad: "+edad+
                ",Tiene pesunna: "+tienePesunna+'}';
    }
    
    @Override
    public void caminar() {
        System.out.println("El Caballo '"+id+"' camino.");
    }
    @Override
    public void respirar() {
        System.out.println("El Caballo '"+id+"' respiro.");
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
