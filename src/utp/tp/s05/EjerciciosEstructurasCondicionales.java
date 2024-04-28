/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s05;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjerciciosEstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Caso 01
        //Escribir un programa en Java para crear una Calculadora de Áreas. 
        //Esta calculadora debe preguntar al usuario por la 
        //figura geométrica (cuadrado, rectángulo, triángulo o círculo) 
        //y una vez seleccionada ésta, deberá solicitar los datos 
        //pertinentes para el cálculo del área respectiva.
        String figura;
        double base, altura, radio;

        Scanner lector = new Scanner(System.in);
        System.out.printf("Ingrese el nombre completo o las tres primeras letras de la figura para calcular su área:\n"
                + "- Cuadrado\n"
                + "- Rectángulo\n"
                + "- Triángulo\n"
                + "- Círculo\n");

        System.out.println("Figura elegida: ");
        figura = lector.nextLine();

        if (figura.equalsIgnoreCase("cuadrado") || figura.contains("cua")) {
            System.out.println("Ingresa valor del lado: ");
            base = lector.nextDouble();
            System.out.println("Área del Cuadrado: " + (base * base));
        } else if (figura.equalsIgnoreCase("rectángulo") || figura.contains("rec")) {
            System.out.println("Ingresa valor de la base: ");
            base = lector.nextDouble();
            System.out.println("Ingresa valor de la altura: ");
            altura = lector.nextDouble();
            System.out.println("Área del Rectángulo: " + (base * altura));
        } else if (figura.equalsIgnoreCase("triángulo") || figura.contains("tri")) {
            System.out.println("Ingresa valor de la base: ");
            base = lector.nextDouble();
            System.out.println("Ingresa valor de la altura: ");
            altura = lector.nextDouble();
            System.out.println("Área del Triángulo: " + (base * altura)/2);
        } else if (figura.equalsIgnoreCase("círculo") || figura.contains("cir")) {
            System.out.println("Ingresa el valor del radio: ");
            radio = lector.nextDouble();
            System.out.println("Área del Círculo: " + Math.PI * Math.pow(radio, 2));
        } else {
            System.out.println("El texto ingresado no es válido.");
        }
        */
    
        /*
        Caso 02
        Una tienda de celulares ofrece distintos planes tarifarios en función 
        de la marca de celular que se compre, así como descuentos aplicados de 
        acuerdo al plazo de pago promocional escogido (ver tablas).
        Escriba un programa en Java que solicite al usuario la marca del 
        celular y el plazo de pago, y muestre el monto del plan tarifario, 
        descuento que le corresponda y el monto final a pagar. 
        Mostrar un mensaje de error si alguna opción ingresada es incorrecta.
        
        Celular	 Plan
        Motorola 29.90
        LG	 36.00
        Samsung	 46.80
        Huawei	 62.00
        iPhone	 71.00
        
        Plazos de pago con promoción
        A 6 meses	A 12 meses	A 18 meses
        13.2%           12.0%           11.2%
               
        */
        
        
        int opcionMarca;
        int opcionPlazo;
        double planTarifario = 0, porcentajeDescuento = 0, montoDescuento;
        Scanner lector = new Scanner(System.in);
        
        System.out.printf("Marcas de celular disponible:\n"+
                "[1] Motorola\n" +
                "[2] LG\n" +
                "[3] Samsung\n" +
                "[4] Huawei\n" +
                "[5] Iphone\nIngrese una opción: ");
        
        opcionMarca = lector.nextInt();        
        switch (opcionMarca) {
            case 1: planTarifario = 29.90; break;
            case 2: planTarifario = 36; break;
            case 3: planTarifario = 46.80; break;
            case 4: planTarifario = 62; break;
            case 5: planTarifario = 71; break;
            default: System.out.println("Opción de celular incorrecta");
        }
        
        if(opcionMarca >= 1 && opcionMarca <=5){
            System.out.printf("Plazos de pago:\n"+
                    "[1] A 06 meses\n" +
                    "[2] A 12 meses\n" +
                    "[3] A 18 meses\nIngrese una opción: ");
            opcionPlazo = lector.nextInt();
            switch (opcionPlazo) {
                case 1: porcentajeDescuento = 13.2; break;
                case 2: porcentajeDescuento = 12.0; break;
                case 3: porcentajeDescuento = 11.2; break;
                default: System.out.println("Opción de plazo incorrecta");
            }
            
            if(opcionPlazo >= 1 && opcionPlazo <=3){
            
                montoDescuento = planTarifario * porcentajeDescuento / 100;
                
                System.out.printf("\n%-25s: %8.2f\n%-25s : %8.2f\n "+
                        "%-25s : %8.2f\n%-25s : %8.2f", 
                        "Plan tarifario", planTarifario, 
                        "Porcentaje de Descuento", porcentajeDescuento,
                        "Monto de Descuento", montoDescuento,
                        "Pago Final", (planTarifario-montoDescuento));
                        
                
            }
        }
        
        
    }
    

}
