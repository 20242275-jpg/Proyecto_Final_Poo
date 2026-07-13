
package modelo;

public class ProyectoConstruccion {

    private String codigo;
    private String nombreProyecto;
    private String direccion;
    private String distrito;
    private int numeroPisos;
    private String fechaInicioObra;
    private String fechaEntregaEstimada;
    private String estadoProyecto;

    public ProyectoConstruccion(String codigo,
                                String nombreProyecto,
                                String direccion,
                                String distrito,
                                int numeroPisos,
                                String fechaInicioObra,
                                String fechaEntregaEstimada,
                                String estadoProyecto) {

        this.codigo = codigo;
        this.nombreProyecto = nombreProyecto;
        this.direccion = direccion;
        this.distrito = distrito;
        this.numeroPisos = numeroPisos;
        this.fechaInicioObra = fechaInicioObra;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.estadoProyecto = estadoProyecto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public String getFechaInicioObra() {
        return fechaInicioObra;
    }

    public void setFechaInicioObra(String fechaInicioObra) {
        this.fechaInicioObra = fechaInicioObra;
    }

    public String getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public void setFechaEntregaEstimada(String fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }

    public String getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(String estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    @Override
    public String toString() {
        return nombreProyecto;
    }

}