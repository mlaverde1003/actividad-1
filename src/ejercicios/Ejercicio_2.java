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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    
    //  2. Leer dos números y determinar ¿cuál de los dos es positivo?
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Ambos números son positivos.");
        } else if (numero1 > 0) {
            System.out.println("El primer número es positivo.");
        } else if (numero2 > 0) {
            System.out.println("El segundo número es positivo.");
        } else {
            System.out.println("Ninguno de los números es positivo.");
        }

        scanner.close();
    }
    
}
