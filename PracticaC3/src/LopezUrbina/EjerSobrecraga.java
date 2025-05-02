
package LopezUrbina;


public class EjerSobrecraga {
        public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma de dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Suma de una lista de enteros
    public int sumar(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }
}
