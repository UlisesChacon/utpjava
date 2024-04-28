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
public class PracticaCalificada4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String tipoProducto;
        int cantidadComprada;
        double precioProducto;
        double descuento = 0;

        System.out.print("Ingrese el tipo de producto (Iphone, Samsung o Google): ");
        tipoProducto = teclado.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad comprada: ");
        cantidadComprada = teclado.nextInt();

        switch (tipoProducto) {
            case "iphone":
                precioProducto = 7000;
                if (cantidadComprada >= 1 && cantidadComprada <= 3) {
                    descuento = 0;
                } else if (cantidadComprada >= 4 && cantidadComprada <= 6) {
                    descuento = 0.05;
                } else if (cantidadComprada >= 7) {
                    descuento = 0.10;
                }
                break;
            case "samsung":
                precioProducto = 6000;
                if (cantidadComprada >= 1 && cantidadComprada <= 2) {
                    descuento = 0;
                } else if (cantidadComprada >= 3 && cantidadComprada <= 5) {
                    descuento = 0.07;
                } else if (cantidadComprada >= 6) {
                    descuento = 0.12;
                }
                break;
            case "google":
                precioProducto = 5000;
                if (cantidadComprada == 1) {
                    descuento = 0;
                } else if (cantidadComprada >= 2 && cantidadComprada <= 3) {
                    descuento = 0.10;
                } else if (cantidadComprada >= 4) {
                    descuento = 0.15;
                }
                break;
            default:
                System.out.println("Tipo de producto no valido.");
                return;
        }

        double precioFinal = precioProducto * (1 - descuento);
        System.out.printf("Descuento aplicado: %.2f%%\n", descuento * 100);
        System.out.printf("Precio final: $%.2f\n", precioFinal);
        
        
    }
    
}
