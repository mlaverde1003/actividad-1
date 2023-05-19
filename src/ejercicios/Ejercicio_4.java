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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    
    //4. Dado dos números ingresados por el usuario realizar las 4 operaciones básicas, suma, resta, multiplicación,
    //división e imprimir las operaciones. Validar la división entre 0(cero).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;

        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("Division: " + numero1 + " / " + numero2 + " = " + division);
        }

        scanner.close();
    }
    
}
