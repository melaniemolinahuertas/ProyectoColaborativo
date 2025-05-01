/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicaa5;

/**
 *
 * @author Piero
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el número 1 (dividendo): ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el número 2 (divisor): ");
            int numero2 = scanner.nextInt();

            int resultado = dividir(numero1, numero2);
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar números enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa. Gracias por usar la calculadora.");
            scanner.close();
        }
    }
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
