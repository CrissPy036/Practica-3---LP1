// Práctica 03 - Ejercicio 03 WHILE - //
/* @author Cristhian Abel Aguilar Gonzalez */

import java.util.Scanner;

public class Practi03Ej4While {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String usuarioAdm = "admin";
        int pin;
        int pinAdm = 123456;
        int correcto = 0;
        System.out.println("-----------------------------------");
        System.out.println("Prueba de *Acceso a un sistema*");
        System.out.println("-----------------------------------");
        while (correcto <= 0) {
            // Entrada de datos
            System.out.printf("Ingrese el *nombre de usuario* --> ");
            usuario = scanner.nextLine();
            System.out.printf("Ingrese *el pin* --> ");
            pin = scanner.nextInt();
            // Verificación
            if ((usuario.equals(usuarioAdm)) && (pin == pinAdm)) {
                correcto = 1;
            }
            if (correcto < 1) {
                System.out.println("Usuario y/o pin incorrecto !!! ");
                scanner.nextLine(); // Reseteo string
            }
        }
        System.out.println("Bienvenido! Accediendo...");
        scanner.close();
    }
}
