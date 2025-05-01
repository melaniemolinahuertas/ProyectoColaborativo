/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Molina;

/**
 *
 * @author sccps
 */
public class Calculadora {
    //SOBRECARGA DE METODOS

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma (int, int): " + calc.sumar(5, 3));
        System.out.println("Suma (int, int, int): " + calc.sumar(1, 2, 3));
        System.out.println("Suma (double, double): " + calc.sumar(2.5, 3.5));
    }
}
