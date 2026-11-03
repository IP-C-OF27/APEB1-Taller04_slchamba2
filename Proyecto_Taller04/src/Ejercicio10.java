
import java.util.Scanner;

/**
 * Ejercicio 09: El programa debe calcular el área del polígono. 
 * La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos
 * iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado,
 * y un rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del 
 * cuadrado, mientras que la altura mide lo mismo que la altura de los 
 * triángulos. Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado
* la medida de uno de sus lados. 
* parte interesante de este problema es determinar el mínimo número de datos
* que hay que preguntar. Polígono
 * @author Steven Chamba 
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double lado, altura;
        double areaA, areaB, areaC;
        double areaD, areaE, areaTotal;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();
        System.out.print("Ingrese la altura de los triangulos: ");
        altura = entrada.nextDouble();
        areaA = lado * lado;
        areaB = (lado * altura) / 2;
        areaC = (lado * altura) / 2;
        areaE = (lado * altura) / 2;
        areaD = lado * altura;
        areaTotal = areaA + areaB + areaC + areaD + areaE;
        System.out.println("Area del cuadrado A: " + areaA);
        System.out.println("Area del triangulo B: " + areaB);
        System.out.println("Area del triangulo C: " + areaC);
        System.out.println("Area del rectangulo D: " + areaD);
        System.out.println("Area del triangulo E: " + areaE);

        System.out.println("El area total del poligono es: " + areaTotal);
    }
                
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el lado del cuadrado: 12
Ingrese la altura de los triangulos: 14
Area del cuadrado A: 144.0
Area del triangulo B: 84.0
Area del triangulo C: 84.0
Area del rectangulo D: 168.0
Area del triangulo E: 84.0
El area total del poligono es: 564.0
BUILD SUCCESSFUL (total time: 16 seconds)

 */