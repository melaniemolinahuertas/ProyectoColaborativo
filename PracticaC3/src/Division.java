/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Division {
   // EJERCICIO CON MANEJO DE ERRORES 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}
