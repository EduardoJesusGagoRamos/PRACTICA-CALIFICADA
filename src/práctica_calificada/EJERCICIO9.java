//  En un certamen de atletismo se desea implementar un control para almacenar el tiempo de cada corredor y además determinar por los datos obtenidos en los tiempos de los orredores cual es el ganador. Se debe especificar cuantos atletas van a participar.

package práctica_calificada;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        int c = 0;
        int a;
        float m = 0;
        System.out.println("Ingresar cantidad de atletas");
        c = dato.nextInt();
        String atleta[] = new String[c];
        float tiempo[] = new float[c];
        for (a = 0; a < c; a++) {
            System.out.println("Ingrese nombre del atleta");
            atleta[a] = dato.next();
            System.out.println("Ingrese tiempo del recorrido");
            tiempo[a] = dato.nextFloat();
        }
        for (int i = 1; i < tiempo.length; i++) {
            if (m > tiempo[i]) {
                m = tiempo[i];
            } else {
                m = tiempo[i];
                System.out.println("El ganador es el atleta "+a+" con el tiempo " + m);
            }
        }
    }
}
