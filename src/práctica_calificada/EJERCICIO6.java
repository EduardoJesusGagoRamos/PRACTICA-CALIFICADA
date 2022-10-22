// Ingresar 10 números enteros y mostrar los números pares.

package práctica_calificada;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        int par[] = new int[10];
        int valor[] = new int[10];
        int contador = 0;
        int i;
        System.out.println("Ingrese los 10 numeros a evaluar");
        for (i = 0; i < 10; i++) {
            par[i] = dato.nextInt();
            if (par[i] % 2 == 0) {
                valor[contador] = par[i];
                contador++;
            }
        }
        System.out.println("Los numeros pares son : ");
        for (i = 0; i < contador; i++) {
            System.out.println(valor[i]);
        }
    }
}
