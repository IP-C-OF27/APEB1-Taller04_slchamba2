
import java.util.Scanner;

/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar
 * el valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."

"
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify;
        double total, descuento, totalPagar;
        int edad;
        System.out.print("Ingrese el costo de Netflix: ");
        netflix = entrada.nextDouble();
        System.out.print("Ingrese el costo de YouTube Premium: ");
        youtube = entrada.nextDouble();
        System.out.print("Ingrese el costo de Dropbox: ");
        dropbox = entrada.nextDouble();
        System.out.print("Ingrese el costo de Spotify: ");
        spotify = entrada.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        total = netflix + youtube + dropbox + spotify;
        if (edad < 30) {
            descuento = total * 0.20;
            totalPagar = total - descuento;
        } else {
            totalPagar = total;
        }
        System.out.println("Total mensual: $" + total);
        System.out.println("Total a pagar: $" + totalPagar);

    }
    
}
/***
 * run:
Ingrese el costo de Netflix: 8
Ingrese el costo de YouTube Premium: 10
Ingrese el costo de Dropbox: 5
Ingrese el costo de Spotify: 10
Ingrese su edad: 25
Total mensual: $33.0
Total a pagar: $26.4
BUILD SUCCESSFUL (total time: 20 seconds)
*/