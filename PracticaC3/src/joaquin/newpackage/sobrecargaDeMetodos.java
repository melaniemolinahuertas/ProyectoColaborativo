class Calculadora {
    // Método que suma dos números
    int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: método que suma tres números
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: método que suma números decimales
    double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(5, 7)); // 12
        System.out.println(calc.sumar(5, 7, 2)); // 14
        System.out.println(calc.sumar(4.5, 3.2)); // 7.7
    }
}
