
package Login;
import java.io.*;
import java.util.ArrayList;
public class GestorDatos {
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Instalacion> listaInstalaciones = new ArrayList<>();
    public static ArrayList<String> listaTecnicos = new ArrayList<>();
    
    static {
        cargarTecnicosDesdeArchivo();
    }
    
    public static void cargarTecnicosDesdeArchivo() {
        File archivo = new File("tecnicos.txt");
        if (!archivo.exists()) {
            System.err.println("El archivo tecnicos.txt no se encontró.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaTecnicos.add(linea.trim());
            }
        } catch (IOException e) {
            System.err.println("Error al leer tecnicos.txt: " + e.getMessage());
        }
    }
    
    public static void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    public static void agregarInstalacion(Instalacion instalacion) {
        listaInstalaciones.add(instalacion);
    }
    
}
