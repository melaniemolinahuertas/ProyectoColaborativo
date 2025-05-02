/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bocanegra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Chralie
 */
public class ManejoDeErroresCarBu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numerador = 0, denominador = 0, resultado = 0;
            System.out.println("Autor: Carlos BU - Manejo de errores en división interactiva");
            try {
                System.out.print("Ingrese el numerador: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    scanner.next();
                    System.out.print("Ingrese el numerador: ");
                }
                numerador = scanner.nextInt();
                
                System.out.print("Ingrese el denominador: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                    scanner.next();
                    System.out.print("Ingrese el denominador: ");
                }
                denominador = scanner.nextInt();
                
                if (denominador == 0) {
                    throw new ArithmeticException("Error: No se puede dividir entre cero.");
                }
                
                resultado = numerador / denominador;
                System.out.println("Resultado de la división: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar números enteros válidos.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            } finally {
                System.out.println("Operación finalizada. Gracias por usar el programa.");
            }
        }
    }
}
