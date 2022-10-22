// Mostrar el promedio de notas de tres cursos

package práctica_calificada;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cursos[] = {"Diseno", "Estadistica", "Ingles"};
        int practicas[] = {14, 17, 11};
        System.out.println("Promedio de Cursos");
        System.out.println("CURSO NOTA");
        System.out.println("------ ----- ");
        int pp = (practicas[0] + practicas[1] + practicas[2]) / 3;
        for (int s = 0; s < cursos.length; s++) {
            System.out.println(cursos[s] + " " + practicas[s]);
        }
        System.out.println("Su Promedio es : " +pp);
  }
}
