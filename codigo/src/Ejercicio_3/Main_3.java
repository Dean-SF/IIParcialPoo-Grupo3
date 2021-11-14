/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Deyan Sanabria Falls
 */
public class Main_3 {
    public static void main(String[] args) {
        ejercicio3 admin = new ejercicio3();
        ArrayList<Punto> lista;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un archivo encontrado en la carpeta textos sin extension: ");
        
        String nomArchivo = input.nextLine();
        input.close();

        try {
            lista = admin.leeArchivoPuntos(nomArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("ocurrio el error \"" + e + "\" a la hora de abrir el archivo");
            return;
        }
        if(lista == null) {
            System.out.println("Ocurrio un error a la hora de leer el archivo");
            return;
        }
        
        System.out.println("Los datos leidos se ven de la siguiente forma: ");
        for(Punto actual : lista) {
            System.out.println(actual);
        }
    }
}
