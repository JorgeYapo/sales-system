
package modelo;


public class rol {
    private String rolnombre;
    private String descripcion;
    private String rolvalor;
    private String estado;

    public rol(String rolnombre, String descripcion, String rolvalor, String estado) {
        this.rolnombre = rolnombre;
        this.descripcion = descripcion;
        this.rolvalor = rolvalor;
        this.estado = estado;
    }

    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRolvalor() {
        return rolvalor;
    }

    public void setRolvalor(String rolvalor) {
        this.rolvalor = rolvalor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
