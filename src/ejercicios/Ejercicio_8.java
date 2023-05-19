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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    
    //8. Calcular el sueldo a pagar de un trabajador dado que se debe ingresar la 
    //cantidad de horas trabajadas y el valor de la hora en pesos.  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de la hora en pesos: ");
        double valorHora = scanner.nextDouble();

        double sueldo = horasTrabajadas * valorHora;

        System.out.println("El sueldo a pagar es: $" + sueldo);

        scanner.close();
    }
    
}
