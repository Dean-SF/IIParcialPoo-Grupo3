package ejercicio_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ejercicio3
 */
public class ejercicio3 {

    /**
     * Busca atravez de una linea por la palabra "Punto" y dos numeros
     * tipo {@code double} encerrados en parentesis, los espacios entre cada cosa
     * excepto en medio de las letras o numeros se permiten
     * @param linea
     * @return {@code Punto} o {@code null}
     */
    private Punto obtenerPunto(String linea) {

        // Variables de control
        boolean fPunto = true;
        boolean abre = false;
        boolean cierra = false;
        boolean first = false;
        String xString = "";
        String yString = "";
        double x;
        double y;

        // Ciclo para recorrer la linea
        for(int i = 0; i < linea.length(); i++) {
            if(linea.charAt(i) == ' ' || linea.charAt(i) == '\n') { // si hay un espacio o un newline se salta
                continue;
            }
            if(!abre && linea.charAt(i) == '(') {   // si se encuentra un parentesis abierto y todavia
                abre = true;                        // no lo habia encontrado, se asigna true la variable
                continue;                           // de control
            } 

            if(!cierra && linea.charAt(i) == ')') {  // Si se encuentra un parentesis cerrado y todavia no se habia
                cierra = true;                       // encontrado, asigna true en la variable de control y busca que
                i++;                                 // no sobren elementos despues del parentesis
                for(int j = 0; j < linea.length()-i; j++) {
                    if(linea.charAt(i+j) != ' ' && linea.charAt(i) != '\n') {
                        return null;
                    }
                }
                break;
            }

            if(!fPunto && !abre) { // Si hay caracteres en medio de los parentesis y la palabra punto
                return null;       // retorna null
            }

            if(fPunto) {                       // Si se esta buscando la palabra "Punto", cuando se encuentre el primer
                if(linea.length() - i >= 5) {  // caracter diferente de espacio o newline, buscara si hay suficientes
                    String temp = "";          // caracteres despues del caracter para buscar los 5 siguientes
                    for(int j = 0; j < 5; j++) {     // Los 5 siguientes strings (incluyendo el actual) se guardan
                        temp += linea.charAt(i+j);   // en un string
                    }
                    if(temp.equals("Punto")) {      // si este string es igual a la palabra "Punto", entonces se 
                        i += 4;                 // encontro con exito y sigue el metodo, sino retorna null.
                        fPunto = false;
                        continue;
                    }
                }
                return null;
            }

            if(abre) {                                  // una vez encontrado la palabra "punto", si se encuentra un
                if(!first && linea.charAt(i) == ',') {  // parentesis abierto va a buscar por los valores, primero
                    first = true;                       // revisa si el caracter actual no es una coma, si lo es
                    continue;                           // cambia la variable de control a true para indicar que el 
                }                                       // primer valor se encontro


                if(linea.charAt(i-1) == ' ') {              // En este lugar se busca que los numeros no tengan espacios
                    if(!first && xString.length() != 0) {   // entre medio, buscando si el caracter anterior despues
                        return null;                        // de un numero es un espacio, si lo es retorna null
                    } else if(first && yString.length() != 0) {
                        return null;
                    }
                }
                if(linea.charAt(i) < '0' || linea.charAt(i) > '9') {        // Aqui revisa si el caracter no es un
                    if(linea.charAt(i) != '-' && linea.charAt(i) != '.') {  // numero, punto o simbolo menos, si no lo
                        return null;                                        // es retorna null
                    }
                }
                if(!first) {                    // en este lugar va metiendo en un string los numeros
                    xString += linea.charAt(i);
                    continue;
                }
                yString += linea.charAt(i);
            }
        }

        // Si despues de lo anterior llega a este punto pero las variables de control indican que
        // no se realizo el proceso de forma correcta, retorna null
        if(fPunto != false && abre != true && cierra != true && first != false) {
            return null;
        }

        int indexX = xString.indexOf('.');  // busca si los strings con los numeros tienen un punto
        int indexY = yString.indexOf('.');


        if(indexX == -1 || indexY == -1) { // Si no lo tienen retornan null
            return null;
        }

        // despues busca si despues del punto tienen numero o hay mas caracteres, si no retorna null
        if(xString.length()-1 - indexX <= 0 || yString.length()-1 - indexY <= 0 ) {
            return null;
        }
        if(xString.charAt(indexX+1) < '0' || xString.charAt(indexX+1) > '9') {
            return null;
        }
        if(yString.charAt(indexY+1) < '0' || yString.charAt(indexY+1) > '9') {
            return null;
        }

        // Aqui se transforma el string a un double, si falla retorna null
        try {
            x = Double.parseDouble(xString);
            y = Double.parseDouble(yString);
        } catch (NumberFormatException e) {
            return null;
        }
        return new Punto(x, y); // despues de todo lo anterior todo esta correctamente verificado y retorna
                                // una instancia de punto
    }

    /**
     * Este metodo se encarga de leer un archivo ubicado en la carpeta textos
     * Si el archivo no existe lanza un {@code FileNotFoundException}, si ocurre
     * un error en la lectura retorna {@code null}
     * @param nomFich
     * @return Un {@code Arraylist<Punto>} o {@code null} si ocurren fallos
     * @throws FileNotFoundException
     */
    public ArrayList<Punto> leeArchivoPuntos(String nomFich) throws FileNotFoundException {
        // Variables iniciales
        ArrayList<Punto> lista = new ArrayList<Punto>();            
        nomFich = "./src/ejercicio_3/textos/" + nomFich + ".txt";
        FileReader archivo = new FileReader(new File(nomFich));
        BufferedReader lector = new BufferedReader(archivo);


        // While lector de lineas
        try {
            String linea;
            while((linea = lector.readLine()) != null) { // se lee una lina
                Punto temp = obtenerPunto(linea);   // se procesa la linea
                if(temp != null)    // si el punto no era invalido
                    lista.add(temp); // se agrega
                else
                    lista.add(new Punto(Double.MAX_VALUE, Double.MAX_VALUE)); // si no agrega un punto con valores
                                                                              // maximos
            }
        } catch (IOException e) {
            return null;    // Si ocurre un error de lectura, retorna null
        }
        try {
            archivo.close();        // Hay algun error al cerrar el archivo se retorna null
        } catch (IOException e) {
            return null;
        }
        return lista;
    }

}