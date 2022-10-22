// Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por letra y la suma de sus caracteres. 

package práctica_calificada;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        int c = 0;
        System.out.println("Escriba una palabra");
        String palabra = dato.nextLine();
        char caracteres[] = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            c = c + 1;
            caracteres[i] = palabra.charAt(i);
            System.out.println(caracteres[i]);
        }
        System.out.println("La cantidad de caracteres es : " + c);
    }
}
