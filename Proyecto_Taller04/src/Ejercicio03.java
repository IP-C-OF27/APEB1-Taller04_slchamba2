
import java.util.Scanner;

    /**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int numero;
        System.out.print("Ingrese un numero entre 2 y 6: ");
        numero = entrada.nextInt(); 
        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero);
            System.out.println(numero + " x 1 = " + (numero * 1));
            System.out.println(numero + " x 2 = " + (numero * 2));
            System.out.println(numero + " x 3 = " + (numero * 3));
            System.out.println(numero + " x 4 = " + (numero * 4));
            System.out.println(numero + " x 5 = " + (numero * 5));
            System.out.println(numero + " x 6 = " + (numero * 6));
            System.out.println(numero + " x 7 = " + (numero * 7));
            System.out.println(numero + " x 8 = " + (numero * 8));
            System.out.println(numero + " x 9 = " + (numero * 9));
            System.out.println(numero + " x 10 = " + (numero * 10));
        } else {
            System.out.println("Error: el numero debe estar entre 2 y 6.");
        }

    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese un numero entre 2 y 6: 3
Tabla de multiplicar del 3
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
BUILD SUCCESSFUL (total time: 4 seconds)

