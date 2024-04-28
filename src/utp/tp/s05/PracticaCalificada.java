/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s05;
import java.util.Scanner;
/**
 *
 * @author Ulises
 */
public class PracticaCalificada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int numeroDia;

        System.out.print("Introduce un numero del 1 al 7 para representar un dia de la semana: ");
        numeroDia = teclado.nextInt();

        if (numeroDia >= 1 && numeroDia <= 7) {
            switch (numeroDia) {
                case 1:
                    System.out.println("Lunes: Dia laboral");
                    break;
                case 2:
                    System.out.println("Martes: Dia laboral");
                    break;
                case 3:
                    System.out.println("Miércoles: Dia laboral");
                    break;
                case 4:
                    System.out.println("Jueves: Dia laboral");
                    break;
                case 5:
                    System.out.println("Viernes: Dia laboral");
                    break;
                case 6:
                    System.out.println("Sabado: Dia de descanso");
                    break;
                case 7:
                    System.out.println("Domingo: Dia de descanso");
                    break;
            }
        } else {
            System.out.println("Error: Ingrese un numero del (1 al 7).");
        }
        
        
        
    }
    
}


