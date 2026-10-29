
import java.util.Scanner;

    /**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Base del triangulo:");
        base = tcl.nextDouble();
        System.out.println("Base del triangulo:");
        altura = tcl.nextDouble();
        area = (base * altura)/2;
        System.out.println("Area: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Base del triangulo:
3
Base del triangulo:
5
Area: 7.5
BUILD SUCCESSFUL (total time: 7 seconds)
