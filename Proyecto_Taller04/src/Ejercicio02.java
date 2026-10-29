
import java.util.Scanner;

    /**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double gasto1, gasto2, gasto3, total;       
        System.out.print("Ingrese los gastos: ");
        gasto1 = entrada.nextDouble();
        gasto2 = entrada.nextDouble();
        gasto3 = entrada.nextDouble();
        total = (gasto1 + gasto2 + gasto3);
        System.out.print("El total de gastos de los tres hijos es: $" + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese los gastos: 25 60 74 
El total de gastos de los tres hijos es: $159.0BUILD SUCCESSFUL
* (total time: 18 seconds)



