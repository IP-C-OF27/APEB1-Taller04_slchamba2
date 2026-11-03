
import java.util.Scanner;

/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico 
 * de una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la
* nota final redondeada a un decimal."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Declarar variables
        double evaluacion, examen, asistencia;
        double notaFinal;
        System.out.print("Ingrese la nota de evaluacion continua: ");
        evaluacion = entrada.nextDouble();
        System.out.print("Ingrese la nota del examen final: ");
        examen = entrada.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia: ");
        asistencia = entrada.nextDouble();
        notaFinal = (evaluacion * 0.40) + (examen * 0.60);
        notaFinal = Math.round(notaFinal * 10.0) / 10.0;
        System.out.println("Nota final: " + notaFinal);
        if (asistencia < 75) {
            System.out.println("Estado academico: Reprobado");
        } else if (examen < 4) {
            System.out.println("Estado academico: Reprobado");
        } else if (notaFinal >= 7) {
            System.out.println("Estado academico: Aprobado");
        } else if (notaFinal >= 5) {
            System.out.println("Estado academico: Supletorio");
        } else {
            System.out.println("Estado academico: Reprobado");
    }
        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la nota de evaluacion continua: 8
Ingrese la nota del examen final: 9
Ingrese el porcentaje de asistencia: 80
Nota final: 8.6
Estado academico: Aprobado
BUILD SUCCESSFUL (total time: 8 seconds)
 */