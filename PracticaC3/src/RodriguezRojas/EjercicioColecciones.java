
package RodriguezRojas;

import java.util.ArrayList;
public class EjercicioColecciones {
    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<>();

        
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Sandía");

        
        System.out.println("🍉 Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        
        frutas.remove("Banana");

        
        System.out.println("\n🍎 Lista actualizada (sin Banana):");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}

