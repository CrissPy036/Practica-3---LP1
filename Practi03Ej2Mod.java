//Práctica 03 - Ejercicio 01 FOR II Modificado - //

public class Practi03Ej2Mod {
    public static void main(String[] args) {
        int tabla, resultado;
        for (tabla = 1; tabla < 11; tabla++) { // Inicio de bucle 1

            System.out.println("---------------------------");
            System.out.println("Monstrando talba del --> " + tabla);
            System.out.println("---------------------------");
            for (int i = 0; i < 11; i++) { // Inicio de bucle 2
                resultado = tabla * i;
                System.out.println(tabla + "x" + i + "=" + resultado);
            }
        }
        System.out.println("---------------------------");
    }
}
