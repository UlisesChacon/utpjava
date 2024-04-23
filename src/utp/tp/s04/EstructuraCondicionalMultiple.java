/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s04;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EstructuraCondicionalMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cotizacionDolar = 3.8;
        double cotizacionEuro = 4.1;

        System.out.println("*** Bienvenido al sistema de conversión de Divisas ***");
        System.out.println("1. Convertir de USD a SOL");
        System.out.println("2. Convertir de SOL a USD");
        System.out.println("3. Convertir de EUR a SOL");
        System.out.println("4. Convertir de SOL a EUR");
        System.out.println("Ingrese la opción deseada: ");
        int opc = sc.nextInt();

        System.out.println("Ingrese el monto a convertir: ");
        double monto = sc.nextDouble();

        switch (opc) {
            case 1:
                System.out.println("El monto es soles es: " + monto * cotizacionDolar);
                break;
            case 2:
                System.out.println("El monto es dólares es: " + monto / cotizacionDolar);
                break;
            case 3:
                System.out.println("El monto es soles es: " + monto * cotizacionEuro);
                break;
            case 4:
                System.out.println("El monto es euros es: " + monto / cotizacionDolar);
                break;
            default:
                System.out.println("Opción no valida");
        }

    }

}
