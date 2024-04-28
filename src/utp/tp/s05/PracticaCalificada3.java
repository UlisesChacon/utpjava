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
public class PracticaCalificada3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingresa el primer numero entero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        num2 = teclado.nextInt();

        System.out.print("Ingresa el tercer numero entero: ");
        num3 = teclado.nextInt();

        // Comparacion para determinar el mayor
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
