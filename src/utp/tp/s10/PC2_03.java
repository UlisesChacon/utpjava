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
public class PC2_03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        int mayor = arreglo[0];
        int posicionMayor = 0;
        for (int i = 1; i < 10; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                posicionMayor = i;
            }
        }
        System.out.println("El numero mayor del arreglo es: " + mayor + " y se encuentra en la posicion " + (posicionMayor + 1));
        scanner.close();
    }
}
