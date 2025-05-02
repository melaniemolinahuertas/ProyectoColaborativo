import java.util.ArrayList;

class ListaNombres {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Carlos");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}