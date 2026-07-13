
package modelo;

public class AcabadoOpcional {

    private String codigo;
    private String nombre;
    private String descripcion;
    private double costoAdicional;

    public AcabadoOpcional(String codigo, String nombre, String descripcion, double costoAdicional) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoAdicional = costoAdicional;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }
    
    @Override
    public String toString() {
    return nombre;
    }
}
