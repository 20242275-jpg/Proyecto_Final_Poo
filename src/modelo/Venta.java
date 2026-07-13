package modelo;

public class Venta {

    private String codigo;
    private Cliente cliente;
    private Departamento departamento;
    private Empleado asesor;
    private double precioVenta;
    private String modalidadPago;
    private String fechaVenta;

    public Venta(String codigo,
            Cliente cliente,
            Departamento departamento,
            Empleado asesor,
            double precioVenta,
            String modalidadPago,
            String fechaVenta) {

        this.codigo = codigo;
        this.cliente = cliente;
        this.departamento = departamento;
        this.asesor = asesor;
        this.precioVenta = precioVenta;
        this.modalidadPago = modalidadPago;
        this.fechaVenta = fechaVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getAsesor() {
        return asesor;
    }

    public void setAsesor(Empleado asesor) {
        this.asesor = asesor;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getModalidadPago() {
        return modalidadPago;
    }

    public void setModalidadPago(String modalidadPago) {
        this.modalidadPago = modalidadPago;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return codigo;
    }

}