/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s03;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Caso 1:
        Una joyería aplica un descuento si el cliente ha comprado productos por un monto
        no menor de 2500 soles. Dicho monto está almacenado en la variable montoCompra.
         
        System.out.println("'Bienvenido a la Joyería'");
        System.out.println("Ingrese el monto de la compra: ");
        double montoCompra, precioFinal;
        final double DESCUENTO = 0.1;//descuento del 10%
        String txt = "";

        Scanner lector = new Scanner(System.in);
        montoCompra = lector.nextDouble();
        precioFinal = montoCompra;

        if (montoCompra >= 2500) {
            //aplica descuento
            txt = "Se aplicó un 10% de descuento a su compra total";
            precioFinal = montoCompra - montoCompra * DESCUENTO;
        }

        System.out.println("El precio final es: " + precioFinal + "\n" + txt);
         */
 /*
        Caso 2:
        Una persona se puede jubilar si tiene 65 años o más, en el caso de los 
        hombres, y 60 como mínimo, en el caso de las mujeres. Las variables leídas 
        son: sexo y edad. Determinar si la persona puede jubilarse.
         */
        String sexo = "";
        int edad;
        boolean puedeJubilarse = false;

        System.out.println("'Sistema de Jubilación'");

        System.out.println("Ingrese el sexo: ");
        Scanner lector = new Scanner(System.in);
        sexo = lector.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = lector.nextInt();

        if (sexo.equalsIgnoreCase("M") && edad >= 65) {
            puedeJubilarse = true;
        }

        if (sexo.equalsIgnoreCase("F") && edad >= 60) {
            puedeJubilarse = true;
        }
        
        if(puedeJubilarse){
            System.out.println("Felitaciones, SI puedes jubilarte");
        }else{
            System.out.println("AÚN NO puedes jubilarte");
        }

    }

}
