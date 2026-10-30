
import java.util.Scanner;

/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        double costoMinuto, valorPlanilla;
        int minutosConsumidos;        
        System.out.print("Ingrese el costo por minuto: ");
        costoMinuto = entrada.nextDouble();        
        System.out.print("Ingrese los minutos consumidos: ");
        minutosConsumidos = entrada.nextInt();     
        valorPlanilla = costoMinuto * minutosConsumidos;       
        System.out.println("El valor de la planilla telefonica es: $" + valorPlanilla);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese el costo por minuto: 3
Ingrese los minutos consumidos: 4
El valor de la planilla telefonica es: $12.0
BUILD SUCCESSFUL (total time: 6 seconds)
