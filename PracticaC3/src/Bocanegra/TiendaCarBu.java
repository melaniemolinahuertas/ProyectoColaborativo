/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bocanegra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class TiendaCarBu {
    private final ArrayList<String> productos;
    private final ArrayList<Double> precios;

    public TiendaCarBu() {
        productos = new ArrayList<>();
        precios = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio) {
        productos.add(nombre);
        precios.add(precio);
        System.out.println("Producto agregado: " + nombre + " - Precio: S/" + precio);
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("\nLista de productos disponibles:");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i) + " - S/" + precios.get(i));
            }
        }
    }

    public void eliminarProducto(String nombre) {
        int index = productos.indexOf(nombre);
        if (index != -1) {
            productos.remove(index);
            precios.remove(index);
            System.out.println("Producto eliminado: " + nombre);
        } else {
            System.out.println("El producto no se encontró en la tienda.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TiendaCarBu tienda = new TiendaCarBu();
            int opcion;
            
            System.out.println("Autor: Carlos BU - Gestión de tienda interactiva");
            
            do {
                System.out.println("\nElige una opción:");
                System.out.println("1. Mostrar productos");
                System.out.println("2. Agregar producto");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Salir");
                
                System.out.print("Opción: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.next();
                }
                opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                    case 1 -> tienda.mostrarProductos();
                    case 2 -> {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        double precio = -1;
                        do {
                            System.out.print("Ingrese el precio del producto: ");
                            while (!scanner.hasNextDouble()) {
                                System.out.println("Error: Ingrese un número válido.");
                                scanner.next();
                            }
                            precio = scanner.nextDouble();
                        } while (precio < 0);
                        
                        tienda.agregarProducto(nombre, precio);
                    }
                    case 3 -> {
                        System.out.print("Ingrese el nombre del producto a eliminar: ");
                        String productoEliminar = scanner.nextLine();
                        tienda.eliminarProducto(productoEliminar);
                    }
                    case 4 -> System.out.println("Gracias por usar el sistema.");
                    default -> System.out.println("Opción inválida, intenta de nuevo.");
                }
            } while (opcion != 4);
        }
    }
}
