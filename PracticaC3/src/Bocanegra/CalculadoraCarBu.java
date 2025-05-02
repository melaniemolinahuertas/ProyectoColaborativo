
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Charlie
 */
public class CalculadoraCarBu {
    
     public int suma(int a, int b) {
        return a + b;
}
    public int suma(int a, int b, int c) {
        return a + b + c;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public double suma(double a, double b, double c) {
        return a + b + c;
    }

    public String suma(String texto1, String texto2) {
        return texto1 + " " + texto2;
    }

    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             CalculadoraCarBu calc = new CalculadoraCarBu();
             int opcion;
             
             System.out.println("Autor: Carlos BU - Calculadora interactiva");
             
             do {
                 System.out.println("\nElige una operación:");
                 System.out.println("1. Sumar dos enteros");
                 System.out.println("2. Sumar tres enteros");
                 System.out.println("3. Sumar dos decimales");
                 System.out.println("4. Sumar tres decimales");
                 System.out.println("5. Concatenar dos textos");
                 System.out.println("6. Salir");
                 System.out.print("Opción: ");
                 
                 while (!scanner.hasNextInt()) {
                     System.out.println("Error: Ingrese un número válido.");
                     scanner.next();
                 }
                 opcion = scanner.nextInt();
                 scanner.nextLine();
                 
                 switch (opcion) {
                     case 1 -> {
                         System.out.print("Ingrese el primer número entero: ");
                         int a1 = scanner.nextInt();
                         System.out.print("Ingrese el segundo número entero: ");
                         int b1 = scanner.nextInt();
                         System.out.println("Resultado: " + calc.suma(a1, b1));
                     }
                     case 2 -> {
                         System.out.print("Ingrese el primer número entero: ");
                         int a2 = scanner.nextInt();
                         System.out.print("Ingrese el segundo número entero: ");
                         int b2 = scanner.nextInt();
                         System.out.print("Ingrese el tercer número entero: ");
                         int c2 = scanner.nextInt();
                         System.out.println("Resultado: " + calc.suma(a2, b2, c2));
                     }
                     case 3 -> {
                         System.out.print("Ingrese el primer número decimal: ");
                         while (!scanner.hasNextDouble()) {
                             System.out.println("Error: Ingrese un número decimal válido.");
                             scanner.next();
                         }
                         double a3 = scanner.nextDouble();
                         System.out.print("Ingrese el segundo número decimal: ");
                         while (!scanner.hasNextDouble()) {
                             System.out.println("Error: Ingrese un número decimal válido.");
                             scanner.next();
                         }
                         double b3 = scanner.nextDouble();
                         System.out.println("Resultado: " + calc.suma(a3, b3));
                     }
                     case 4 -> {
                         System.out.print("Ingrese el primer número decimal: ");
                         while (!scanner.hasNextDouble()) {
                             System.out.println("Error: Ingrese un número decimal válido.");
                             scanner.next();
                         }
                         double a4 = scanner.nextDouble();
                         System.out.print("Ingrese el segundo número decimal: ");
                         while (!scanner.hasNextDouble()) {
                             System.out.println("Error: Ingrese un número decimal válido.");
                             scanner.next();
                         }
                         double b4 = scanner.nextDouble();
                         System.out.print("Ingrese el tercer número decimal: ");
                         while (!scanner.hasNextDouble()) {
                             System.out.println("Error: Ingrese un número decimal válido.");
                             scanner.next();
                         }
                         double c4 = scanner.nextDouble();
                         System.out.println("Resultado: " + calc.suma(a4, b4, c4));
                     }
                     case 5 -> {
                         System.out.print("Ingrese el primer texto: ");
                         String t1 = scanner.nextLine();
                         System.out.print("Ingrese el segundo texto: ");
                         String t2 = scanner.nextLine();
                         System.out.println("Resultado: " + calc.suma(t1, t2));
                     }
                     case 6 -> System.out.println("Gracias por usar la calculadora.");
                     default -> System.out.println("Opción inválida, intenta de nuevo.");
                 }
             } while (opcion != 6);
         }
    }
}
