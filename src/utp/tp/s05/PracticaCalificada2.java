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
public class PracticaCalificada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        float promedioNotas;
        String participacion;

        System.out.print("Ingresa el promedio de notas del estudiante: ");
        promedioNotas = teclado.nextFloat();

        System.out.print("Ingresa la participacion en clase (Excelente, Muy bueno, Bueno, Regular): ");
        participacion = teclado.next();

        // Validacion del promedio de notas
        if (promedioNotas >= 0 && promedioNotas <= 20) {
            // Determinar la calificacion segun el promedio y la participacion
            switch (participacion.toLowerCase()) {
                case "excelente":
                    if (promedioNotas >= 15) {
                        System.out.println("Calificacion: A+");
                    } else {
                        System.out.println("Calificacion: A");
                    }
                    break;
                case "muy bueno":
                    System.out.println("Calificacion: A");
                    break;
                case "bueno":
                    if (promedioNotas >= 10) {
                        System.out.println("Calificacion: B+");
                    } else {
                        System.out.println("Calificacion: B");
                    }
                    break;
                case "regular":
                    System.out.println("Calificacion: B");
                    break;
                default:
                    System.out.println("Participacion no válida. Debes ingresar: Excelente, Muy bueno, Bueno o Regular.");
            }
        } else {
            System.out.println("El promedio de notas debe estar entre 0 y 20.");
        }
        
    }
    
}
