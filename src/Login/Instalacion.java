
package Login;

import java.util.List;

public class Instalacion {
    private Cliente cliente;
    private String tipo;
    private String fecha;
    private String hora;
    private String direccion;
    private List<String> tecnicos;
    private String estado;
    
    public Instalacion(Cliente cliente, String tipo, String fecha, String hora, String direccion, List<String> tecnicos) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.tecnicos = tecnicos;
        this.estado = "Pendiente"; 
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<String> getTecnicos() {
        return tecnicos;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
