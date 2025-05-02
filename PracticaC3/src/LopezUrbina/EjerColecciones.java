
package LopezUrbina;

import java.util.ArrayList;
import java.util.Collections;
public class EjerColecciones {
        public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");

        Collections.sort(nombres);  // Ordenar alfabéticamente

        System.out.println("Lista de nombres ordenada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
