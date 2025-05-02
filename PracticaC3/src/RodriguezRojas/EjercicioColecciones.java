
package RodriguezRojas;

import java.util.ArrayList;
public class EjercicioColecciones {
    public static void main(String[] args) {
        // Crear una colección de tipo ArrayList
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos a la colección
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Sandía");

        // Mostrar los elementos de la colección
        System.out.println("🍉 Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Eliminar un elemento
        frutas.remove("Banana");

        // Mostrar la lista actualizada
        System.out.println("\n🍎 Lista actualizada (sin Banana):");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}

