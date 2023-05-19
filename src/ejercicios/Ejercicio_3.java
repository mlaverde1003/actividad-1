/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author  Valentina
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    
    // 3. Realizar un programa en Java, que realice una suma si los 3 números son pares, de lo contrario los reste e imprima el resultado. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 % 2 == 0 && numero2 % 2 == 0 && numero3 % 2 == 0) {
            int suma = numero1 + numero2 + numero3;
            System.out.println("La suma de los tres números es: " + suma);
        } else {
            int resta = numero1 - numero2 - numero3;
            System.out.println("La resta de los tres números es: " + resta);
        }

        scanner.close();
    }
    
}
