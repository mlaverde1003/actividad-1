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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    
    //6. Calcular el cuadrado de un número ingresado por teclado e imprimirlo. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        scanner.close();
    }
    
}
