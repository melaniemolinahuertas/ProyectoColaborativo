/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicaa5;

/**
 *
 * @author Piero
 */
public class Conversor {
    public double convertir(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public double convertir(int kilometros) {
        return kilometros * 0.621371;
    }

    public double convertir(double soles, double tipoCambio) {
        return soles / tipoCambio;
    }

    public static void main(String[] args) {
        Conversor conv = new Conversor();

        System.out.println("30 °C a Fahrenheit: " + conv.convertir(30.0));
        System.out.println("10 km a millas: " + conv.convertir(10));
        System.out.println("500 soles a dólares (tipo de cambio 3.8): " + conv.convertir(500.0, 3.8));
    }
}
