/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Valentina
 */

//Calcular el cubo de un número entero ingresado por el usuario. 
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cubo = numero * numero * numero;

        System.out.println("El cubo de " + numero + " es: " + cubo);

        scanner.close();
    }
    
}
