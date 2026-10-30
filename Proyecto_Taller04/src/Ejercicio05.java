
import java.util.Scanner;

/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU,
 * teclado, pantalla, ratón."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double cpu, teclado, pantalla, raton, costoTotal;
        System.out.print("Ingrese el costo del CPU: ");
        cpu = entrada.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        teclado = entrada.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        pantalla = entrada.nextDouble();
        System.out.print("Ingrese el costo del raton: ");
        raton = entrada.nextDouble();
        costoTotal = cpu + teclado + pantalla + raton;
        System.out.println("El costo total de la computadora es: $" + costoTotal);    
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese el costo del teclado: 80
Ingrese el costo de la pantalla: 70
Ingrese el costo del raton: 50
El costo total de la computadora es: $250.0
BUILD SUCCESSFUL (total time: 24 seconds)
 */