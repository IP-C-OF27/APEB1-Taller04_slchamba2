
import java.util.Scanner;

/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%.

"
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio07 {
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
        double costoKilovatio, valorPlanilla, descuento, totalPagar;
        int kilovatios, edad;
        System.out.print("Ingrese el costo por kilovatio: ");
        costoKilovatio = entrada.nextDouble();
        System.out.print("Ingrese los kilovatios consumidos: ");
        kilovatios = entrada.nextInt();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        valorPlanilla = costoKilovatio * kilovatios;
        if (edad > 65) {
            descuento = valorPlanilla * 0.10;
            totalPagar = valorPlanilla - descuento;
        } else {
            totalPagar = valorPlanilla;
        }
        System.out.println("Valor de la planilla: $" + valorPlanilla);
        System.out.println("Total a pagar: $" + totalPagar);
   }
        
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el costo por kilovatio: 10
Ingrese los kilovatios consumidos: 200
Ingrese su edad: 65
Valor de la planilla: $2000.0
Total a pagar: $2000.0
BUILD SUCCESSFUL (total time: 11 seconds)
 */