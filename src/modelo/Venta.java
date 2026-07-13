
package modelo;

public class Venta {
    
    private String codigo;
    private Cliente cliente;
    private Departamento departamento;
    private Empleado asesor;
    private ModalidadPago modalidadPago;
    private double precioVenta;
    private String fechaVenta;

    public Venta(String codigo, Cliente cliente, Departamento departamento, Empleado asesor, ModalidadPago modalidadPago, double precioVenta, String fechaVenta) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.departamento = departamento;
        this.asesor = asesor;
        this.modalidadPago = modalidadPago;
        this.precioVenta = precioVenta;
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

    public ModalidadPago getModalidadPago() {
        return modalidadPago;
    }

    public void setModalidadPago(ModalidadPago modalidadPago) {
        this.modalidadPago = modalidadPago;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    public double calcularMontoTotal(){
    return modalidadPago.calcularMontoTotal(precioVenta);
    }
    
    public String obtenerResumenPago(){
    return modalidadPago.generarResumenPago();
    }
    
    @Override
    public String toString(){
    return codigo;
    }
}
