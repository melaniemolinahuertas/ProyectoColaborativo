
package RodriguezRojas;
import java.util.Scanner;
public class EjercicioErrores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entero: ");
            String entrada = scanner.nextLine();
            
            int numero = Integer.parseInt(entrada);
            System.out.println("✅ Número ingresado correctamente: " + numero);
            
        } catch (NumberFormatException ex) {
            System.out.println("❌ Error: El valor ingresado no es un número entero válido.");
        } catch (Exception ex) {
            System.out.println("⚠️ Se ha producido un error inesperado: " + ex.getMessage());
        } finally {
            scanner.close();
            System.out.println("🟢 Proceso finalizado.");
        }
    }
}
