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
public class PC2_04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);

        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int[] ventas = new int[7];

        System.out.println("********** Registro de ventas diarias ***************");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + " (" + diasSemana[i] + ") $");
            ventas[i] = scanner.nextInt();
        }

        int totalVentas = 0;
        int mayorVenta = ventas[0];
        int diaMayorVenta = 0;

        for (int i = 0; i < 7; i++) {
            totalVentas += ventas[i];
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                diaMayorVenta = i;
            }
        }

        System.out.println("******************************************************");
        System.out.println("Total de ventas: $" + totalVentas);
        System.out.println("El dia con mayor cantidad de ventas fue el " + diasSemana[diaMayorVenta] + ".");

        scanner.close();
    }
    
}
