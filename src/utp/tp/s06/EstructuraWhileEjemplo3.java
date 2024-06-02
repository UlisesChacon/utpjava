/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s06;

/**
 *
 * @author user
 */
public class EstructuraWhileEjemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont = 0;
        int suma = 0;
        int i = 0;

        System.out.println("Números pares menores a 20");

        while (i < 2000) {

            if (i % 2 == 0) {
                cont++;//cuenta los números pares menores que 20
                suma = +i;//suma los números pares menores que 20
                System.out.print(i + ", ");
            }

            i++;
        }

        System.out.println("Conteo: " + cont);
        System.out.println("Suma: " + suma);

    }

}
