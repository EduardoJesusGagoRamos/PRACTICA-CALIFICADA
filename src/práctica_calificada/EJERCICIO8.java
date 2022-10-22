// Un cliente realiza la siguiente compra de artefactos, plancha, licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y el pago total si le corresponde un descuento. 

package práctica_calificada;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        double p, l, k, c, s, e, d;
        System.out.println("Ingrese el precio de la plancha:");
        p = Entrada.nextDouble();
        System.out.println("Ingrese el precio de la licuadora:");
        l = Entrada.nextDouble();
        System.out.println("Ingrese el precio de la lavadora:");
        k = Entrada.nextDouble();
        System.out.println("Ingrese el precio de la cocina:");
        c = Entrada.nextDouble();
        s = p + l + k + c;
        System.out.println("El monto de los productos es: " + s);
        if (s > 1200) {
            e = s * 17 / 100;
            d = s - e;
            System.out.println("El descuento es: " + e);
            System.out.println("El monto a pagar con el descuento es: " + d);
        } else {
            System.out.println("No hay ningun descuento.");
            System.out.println("El monto a pagar es: " + s);
        }
    }
}
