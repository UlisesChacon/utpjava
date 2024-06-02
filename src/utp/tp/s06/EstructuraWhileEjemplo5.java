/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.tp.s06;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class EstructuraWhileEjemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa en Java para pida una clave de acceso. Mostrar “Acceso denegado” mientras la clave ingresada sea diferente de “P@55w0rd”. 
        Si se ingresa la clave correcta se mostrará “Bienvenido al sistema” y el programa termina.
        El número máximo de intentos es 5. Si el usuario excede el límite se mostrará “Cuenta suspendida” y el programa termina.
         */

        Scanner lector = new Scanner(System.in);

        final String CLAVE_CORRECTA = "P@55w0rd";
        final int NRO_MAX_INTENTOS = 5;
        int nroIntentos = 0;

        while (nroIntentos < NRO_MAX_INTENTOS) {

            //Usando la clase Scanner
            //System.out.println("Ingrese la clave secreta para acceder: ");            
            //String input = lector.nextLine();
            //Usando la clase JOptionPane
            String input = JOptionPane.showInputDialog(null, 
                    "Ingrese la clave secreta para acceder:");

            if (input.equals(CLAVE_CORRECTA)) {
                //System.out.println("Bienvenido al sistema.");
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema.");
                return;
            } else {
                //System.out.println("Acceso denegado.");
                JOptionPane.showMessageDialog(null, "Acceso denegado.");
                nroIntentos++;
                //System.out.println("Le quedan " + (NRO_MAX_INTENTOS - nroIntentos) + " intentos.");

                if (nroIntentos == NRO_MAX_INTENTOS) {                    
                    //System.out.println("Cuenta suspendida.");
                    JOptionPane.showMessageDialog(null, "Cuenta suspendida.");
                    return;
                }
            }
        }

    }

}
