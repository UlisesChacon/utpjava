/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s06;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EstructuraWhileEjemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa en Java para solicitar un número repetidamente 
        mientras éste se encuentre entre 1 y 100.
        Ingresado el valor válido, el programa continúa si el usuario 
        responde Sí a “¿Desea continuar? (Si o No)”. Si contesta No, el programa termina.
        */
        
        Scanner lector = new Scanner(System.in);        
        int numero;
        String rpta = "si";
        
        while (rpta.equalsIgnoreCase("si")) {
            
            System.out.println("Ingrese un número entre 1 y 100: ");
            numero = lector.nextInt();
            
            if(numero>=1 && numero<=100){
                System.out.println("El número ingresado es válido.");
            }else{
                System.out.println("El número ingresado no está entre 1 y 100.");
            }
            
            System.out.println("¿Desea continuar? (Si/No): ");
            rpta = lector.next();
            
        }
        
        System.out.println("Se terminó el código.");
    }
    
}
