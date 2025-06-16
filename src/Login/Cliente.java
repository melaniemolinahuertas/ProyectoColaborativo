
package Login;

public class Cliente {
    private String nombre;
    private String RUC;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String RUC, String razonSocial, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }
    
    @Override
    public String toString() {
        return nombre + (razonSocial.isEmpty() ? "" : " - " + razonSocial);
    }
}
