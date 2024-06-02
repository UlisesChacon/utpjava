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
public class EstructuraWhileEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int dia = 0;
        boolean esDiaInvalido = true;
        
        while (esDiaInvalido) {
            
            System.out.println("Ingrese el día de la semana (1-7): ");
            dia = lector.nextInt();
            lector.nextLine();
            esDiaInvalido = (dia<1 || dia>7);
            
        }
        
        System.out.println("Día ingresado: "+dia);
        
    }
    
}
