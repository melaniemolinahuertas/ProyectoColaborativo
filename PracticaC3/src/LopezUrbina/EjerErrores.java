
package LopezUrbina;

import java.util.Scanner;
public class EjerErrores {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el denominador: ");
            int denominador = Integer.parseInt(scanner.nextLine());

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Operación finalizada.");
            scanner.close();
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
