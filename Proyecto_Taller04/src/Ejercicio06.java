
import java.util.Scanner;

/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double prestamo, interes, pagoMensual, totalPagar;
        System.out.print("Ingrese el monto del prestamo: ");
        prestamo = entrada.nextDouble();
        System.out.print("Ingrese el interes mensual (%): ");
        interes = entrada.nextDouble();
        totalPagar = prestamo + (prestamo * interes / 100);
        pagoMensual = totalPagar / 12;
        System.out.println("El total a pagar es: $" + totalPagar);
        System.out.println("El pago mensual es: $" + pagoMensual);
    }
        
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese el monto del prestamo: 50000
Ingrese el interes mensual (%): 15
El total a pagar es: $57500.0
El pago mensual es: $4791.666666666667
 */
