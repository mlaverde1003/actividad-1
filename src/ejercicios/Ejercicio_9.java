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
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    
    //Calcular el interés a pagar de un dinero colocado a generar interés diario. Se debe ingresar la cantidad de 
    //dinero, los días que lleva generando interés y el interés. Se debe imprimir el interés y la cantidad de dinero más el interés. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero: ");
        double cantidadDinero = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de dias generando interes: ");
        int dias = scanner.nextInt();

        System.out.print("Ingrese la tasa de interes (%): ");
        double tasaInteres = scanner.nextDouble();

        double interes = cantidadDinero * (tasaInteres / 100) * dias;
        double total = cantidadDinero + interes;

        System.out.println("El interes a pagar es: $" + interes);
        System.out.println("La cantidad de dinero mas el interes es: $" + total);

        scanner.close();
    }
    
}
