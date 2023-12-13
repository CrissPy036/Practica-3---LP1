//Práctica 03 - Ejercicio 01 FOR II - //

import java.util.Scanner;

public class Practi03Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializador para el escaneo de entrada del teclado
        int tabla, resultado;
        // Entrada
        System.out.print("Que tabla desea mostrar? --> ");
        tabla = scanner.nextInt();
        System.out.println("---------------------------");
        System.out.println("Monstrando talba del --> " + tabla);
        System.out.println("---------------------------");
        for (int i = 0; i < 11; i++) {
            resultado = tabla * i;
            System.out.println(tabla + "x" + i + "=" + resultado);
        }
        System.out.println("---------------------------");
        scanner.close();
    }
}
