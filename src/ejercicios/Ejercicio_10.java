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
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    //10. Realizar la suma de N número ingresados por el usuario.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los " + cantidadNumeros + " números es: " + suma);

        scanner.close();
    }
    
}
