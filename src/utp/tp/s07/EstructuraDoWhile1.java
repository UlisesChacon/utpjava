/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s07;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EstructuraDoWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String continuar = "";

        do {

            System.out.println("Ingrese un número entero: ");
            int numero = lector.nextInt();

            System.out.println("Elija una operación:");
            System.out.println("(1) Determinar si es primo.");
            System.out.println("(2) Hallar su factorial.");

            int opc = lector.nextInt();

            switch (opc) {
                case 1 -> {
                    if (esPrimo(numero)) {
                        System.out.println(numero + " es un número primo.");
                    } else {
                        System.out.println(numero + " no es un número primo.");
                    }
                }
                case 2 -> {
                    long factorial = calcularFactorial(numero);
                    System.out.println("El factorial de " + numero + " es: " + factorial);
                }

                default -> System.out.println("Opción no válida.");
            }
            
            System.out.println("¿Desea continuar? (si/no): ");
            continuar = lector.next();
            
        } while (continuar.equalsIgnoreCase("si"));

    }

    private static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        //primeros numeros primos >> 2,3,5,7, 11
        //otra forma
        //if(numero<=1){return false};
        //if(numero<=3){return true};
        //if(numero%2==0 || numero%3==0){return false};
        //int i = 5;
        /*
        while (i*i <=numero){
            if(numero % i == 0 11 numero % (i+2) ==0){
            return false;
            }
            i = i+6;
        }
        return true;
         */
        return true;
    }

    private static long calcularFactorial(int numero) {

        //factorial de 3 >> 3x2x1 = 6            
        //factorial de 5 >> 5x4x3x2x1 =  120
        if (numero == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
