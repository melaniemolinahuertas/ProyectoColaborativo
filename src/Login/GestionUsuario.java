
package Login;
import java.io.*;
import java.util.*;

public class GestionUsuario {
    private List<Usuario> usuarios = new ArrayList<>();

    public GestionUsuario() {
        cargarUsuariosDesdeArchivo();
    }

    private void cargarUsuariosDesdeArchivo() {
        File archivo = new File("usuarios.txt");
        if (!archivo.exists()) {
            System.err.println("El archivo usuarios.txt no se encontró.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    usuarios.add(new Usuario(datos[0], datos[1], datos[2]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer usuarios.txt: " + e.getMessage());
        }
    }

    public Usuario buscarUsuario(String usuario) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                return u;
            }
        }
        return null;
    }

    public boolean validarLogin(String usuario, String pass) {
        Usuario u = buscarUsuario(usuario);
        return u != null && u.getContraseña().equals(pass);
    }
}
