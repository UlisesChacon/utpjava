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
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Caso 01:
        //Escribir un programa que solicite la edad de una persona y muestre con
        //un mensaje si es mayor o menor de edad
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        String msg = edad >=18 ? "Es mayor de edad" : "Es menor de edad";        
        System.out.println(msg);
        */
        
        //Caso 02
        //Escribir un programa que solicite un número entero y muestre con un 
        //mensaje si es positivo, negativo o cero
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int nro = sc.nextInt();
        
        String msg = nro > 0 ? "Positivo" : nro <0 ? "Negativo" : "Cero";
        System.out.println(msg);
        
    }
    
}
