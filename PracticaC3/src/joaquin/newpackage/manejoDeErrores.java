class ManejoErrores {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto causa una excepción
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida.");
        }
    }
}
