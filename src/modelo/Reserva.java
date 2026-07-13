
package modelo;

public class Reserva {
    
    private String codigo;
    private Cliente cliente;
    private Departamento departamento;
    private Empleado asesor;
    private String fechaReserva;
    private double montoReserva;
    private boolean activa;

    public Reserva(String codigo, Cliente cliente, Departamento departamento, Empleado asesor, String fechaReserva, double montoReserva, boolean activa) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.departamento = departamento;
        this.asesor = asesor;
        this.fechaReserva = fechaReserva;
        this.montoReserva = montoReserva;
        this.activa = activa;
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

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public double getMontoReserva() {
        return montoReserva;
    }

    public void setMontoReserva(double montoReserva) {
        this.montoReserva = montoReserva;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
    public boolean estaActiva(){
    return activa;
    }
    
    public void desactivar(){
    activa = false;
    }
    
    @Override
    public String toString(){
    return codigo;
    }
}
