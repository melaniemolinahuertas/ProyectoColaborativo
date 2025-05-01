/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicaa5;

/**
 *
 * @author Piero
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Tienda {
    private Map<String, Double> productos;
    private ArrayList<String> productosAgregados;

    public Tienda() {
        productos = new HashMap<>();
        productosAgregados = new ArrayList<>();
    }
    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
        System.out.println("Producto " + nombre + " agregado al inventario.");
    }
    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            productosAgregados.remove(nombre);
            System.out.println("Producto " + nombre + " eliminado del inventario.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            System.out.println("Productos disponibles:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
            }
        }
    }
    public void agregarAlCarrito(String nombre) {
        if (productos.containsKey(nombre)) {
            productosAgregados.add(nombre);
            System.out.println("Producto " + nombre + " agregado al carrito.");
        } else {
            System.out.println("El producto no está disponible.");
        }
    }
    public void mostrarCarrito() {
        if (productosAgregados.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Productos en el carrito:");
            for (String producto : productosAgregados) {
                System.out.println("Producto: " + producto);
            }
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        tienda.agregarProducto("Camiseta", 15.99);
        tienda.agregarProducto("Pantalón", 30.50);
        tienda.agregarProducto("Zapatos", 45.00);
        int opcion;
        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Mostrar productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Mostrar carrito");
            System.out.println("4. Eliminar producto del inventario");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tienda.mostrarProductos();
                    break;
                case 2:
                    System.out.print("Ingresa el nombre del producto a agregar al carrito: ");
                    scanner.nextLine();  // Consumir la nueva línea
                    String producto = scanner.nextLine();
                    tienda.agregarAlCarrito(producto);
                    break;
                case 3:
                    tienda.mostrarCarrito();
                    break;
                case 4:
                    System.out.print("Ingresa el nombre del producto a eliminar: ");
                    scanner.nextLine();  // Consumir la nueva línea
                    String productoEliminar = scanner.nextLine();
                    tienda.eliminarProducto(productoEliminar);
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}