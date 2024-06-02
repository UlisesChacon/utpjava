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
public class PC2_02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sumaPares = 0;
            int sumaImpares = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sumaPares += i; 
                } else {
                    sumaImpares += i;
                }
            }
            System.out.println("La suma de los numeros pares es: " + sumaPares);
            System.out.println("La suma de los numeros impares es: " + sumaImpares);
        } else {

            System.out.println("El numero ingresado no es positivo.");
        }
        scanner.close();

    }
}
