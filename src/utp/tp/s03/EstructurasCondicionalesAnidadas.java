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
public class EstructurasCondicionalesAnidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
      Caso 01:  
      Escribir un programa que solicite un número entero y determine si es 
      positivo, negativo o cero.
   
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = lector.nextInt();
        lector.nextLine();

        if (numero > 0) {
            System.out.println("Positivo");

        } else {

            if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Cero");
            }
        }

         */
 /*
        Caso 02:
        El gobierno ha decretado un aumento en los salarios de los altos 
        funcionarios de acuerdo a la siguiente escala:
        
        Sexo            Salud(S) Educacion(E) Transporte(T)
        Femenino (F)    25%      12%          20%
        Masculino(M)    20%      11%          15%
        
        Los salarios actuales son: Salud (S/.15000), Educación (S/.12000), 
        Transporte (S/. 18000)
        
        Escribir un programa en Java que solicite el sexo y sector de un 
        funcionario y calcular el monto que percibirá luego de aplicado 
        el aumento.

         */
        String sexo, sector;
        double sueldoActual=0, aumento=0, sueldoFinal=0;
        final double SUELDO_SALUD = 15000;
        final double SUELDO_EDUCA = 12000;
        final double SUELDO_TRANS = 18000;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el sexo (M/F): ");
        sexo = lector.nextLine();
        System.out.println("Ingrese el sector Salud(S), Educacion(E), Transporte(T): ");
        sector = lector.nextLine();

        if (sexo.equalsIgnoreCase("M")) {
            if (sector.equalsIgnoreCase("S")) {
                sueldoActual = SUELDO_SALUD;
                aumento = sueldoActual * 0.20;
            }
            if (sector.equalsIgnoreCase("E")) {
                sueldoActual = SUELDO_EDUCA;
                aumento = sueldoActual * 0.11;
            }
            if (sector.equalsIgnoreCase("T")) {
                sueldoActual = SUELDO_TRANS;
                aumento = sueldoActual * 0.15;
            }
        }
        if (sexo.equalsIgnoreCase("F")) {
            if (sector.equalsIgnoreCase("S")) {
                sueldoActual = SUELDO_SALUD;
                aumento = sueldoActual * 0.25;
            }
            if (sector.equalsIgnoreCase("E")) {
                sueldoActual = SUELDO_EDUCA;
                aumento = sueldoActual * 0.12;
            }
            if (sector.equalsIgnoreCase("T")) {
                sueldoActual = SUELDO_TRANS;
                aumento = sueldoActual * 0.20;
            }
        }
        
        sueldoFinal = sueldoActual + aumento;
        System.out.println("Sueldo inicial: "+sueldoActual);
        System.out.println("Aumento: "+aumento);
        System.out.println("Sueldo final: "+sueldoFinal);
    }

}
