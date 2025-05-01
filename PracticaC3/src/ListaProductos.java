/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

public class ListaProductos {
    //Colecciones
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Laptop");
        productos.add("Monitor");
        productos.add("Teclado");

        System.out.println("Lista de productos:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }
}