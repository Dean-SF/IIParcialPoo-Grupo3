package Ejercicio_2;
import java.util.ArrayList;

public class Main_2 {
    public static void main(String args[]){
        ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
        Mamifero caballo = new Caballo("MT-1",5,true);
        mamiferos.add(caballo);
        Mamifero chimpance = new Chimpance("MT-2",4,false);
        mamiferos.add(chimpance);
        Mamifero elefante = new Elefante("MT-3",6,true);
        mamiferos.add(elefante);
        Mamifero leon = new Leon("MT-4",7,false);
        mamiferos.add(leon);
        Mamifero ballena = new Ballena("MA-1",10,true);
        mamiferos.add(ballena);
        Mamifero dellfin = new Delfin("MA-2",4,true);
        mamiferos.add(dellfin);
        Mamifero morsa = new Morsa("MA-3",2,false);
        mamiferos.add(morsa);
        Mamifero manati = new Manati("MA-4",1,false);
        mamiferos.add(manati);
        
        System.out.println("--------------------");
        Mamifero temp;
        for(int i = 0; i<mamiferos.size(); i++){
            temp = mamiferos.get(i);
            System.out.println(temp.toString());
            temp.respirar();
            if(temp instanceof Terrestre){
                System.out.println("El mamifero es tipo Terrestre.");
                ((Terrestre)temp).caminar();
            }else{
                System.out.println("El mamifero es tipo Acuatico.");
                ((Acuatico)temp).nadar();
            }
            if(i<mamiferos.size()-1){
                System.out.println('\n'+"--------------------");
            }
        }
    }
}
