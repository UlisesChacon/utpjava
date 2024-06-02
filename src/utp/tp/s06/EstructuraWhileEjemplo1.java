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
public class EstructuraWhileEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad=-1;
        Scanner lector = new Scanner (System.in);
        
        while (edad<0) {
            System.out.println("Ingrese su edad: ");
            edad = lector.nextInt();
            lector.nextLine();
        }
        
        System.out.println("Edad ingresada: "+edad);
        
    }
    
}
