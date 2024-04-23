/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s04;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EjerciciosCondicionalMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que le permita a un docente, ingresar la nota de un 
        //alumno y le devuelva el mensaje según el siguiente cuadro:​
        //    Nota            Mensaje
        //    >=18 y <=20     "Excelente"
        //    >15 y <=18      "Bueno"
        //    >=13 y <=15     "Regular"
        //    <13 y >=0       "Deficiente"

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota = sc.nextInt();
        
        String mensaje = switch (nota) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ->
                "Deficiente";
            case 13, 14, 15 ->
                "Regular";
            case 16, 17, 18 ->
                "Bueno";
            case 19, 20 ->
                "Excelente";
            default -> "Opción no válida";
        };
        
        System.out.println(mensaje);

    }

}
