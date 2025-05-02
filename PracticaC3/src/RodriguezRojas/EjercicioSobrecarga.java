
package RodriguezRojas;

public class EjercicioSobrecarga {
    public static void main(String[] args) {
        saludar();
        saludar("Diego");
        saludar("Joaquin", 25);
    }

    
    public static void saludar() {
        System.out.println("¡Hola!");
    }

    
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

   
    public static void saludar(String nombre, int edad) {
        System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años.");
    }
}
