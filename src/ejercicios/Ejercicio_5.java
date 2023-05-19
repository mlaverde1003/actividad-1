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

//5. Dado una compra realizada calcular: el iva e imprimir: la compra sin iva, el iva en pesos y el monto más el iva.
//Tomar en cuenta que el iva es el 19%(Utilizar constante para el iva). 

public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        final double IVA_PORCENTAJE = 19.0;

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        double iva = montoCompra * (IVA_PORCENTAJE / 100);
        double compraSinIVA = montoCompra - iva;
        double montoConIVA = montoCompra + iva;

        System.out.println("Compra sin IVA: $" + compraSinIVA);
        System.out.println("IVA en pesos: $" + iva);
        System.out.println("Monto total con IVA: $" + montoConIVA);

        scanner.close();
    }
    
}
