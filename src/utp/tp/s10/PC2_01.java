/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s10;
import java.util.Scanner;
/**
 *
 * @author Jeho Ulises Chacon Cayo
 * Codigo estudiante: U22328040
 */
public class PC2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Tabla de multiplicar del " + n);

            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("El numero ingresado no es positivo.");
        }
        scanner.close();        
    }
}
