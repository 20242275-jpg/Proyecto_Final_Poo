/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erick
 */
public class Departamento {
    //Atributos
    private String codigo;
    private ProyectoConstruccion proyecto;
    private int piso;
    private String numero;
    private double area;
    private int dormitorios;
    private int banios;
    private String tipo;
    private double precio;
    private String estado;

    public Departamento(String codigo, ProyectoConstruccion proyecto, int piso, String numero, double area, int dormitorios, int banios, String tipo, double precio, String estado) {
        this.codigo = codigo;
        this.proyecto = proyecto;
        this.piso = piso;
        this.numero = numero;
        this.area = area;
        this.dormitorios = dormitorios;
        this.banios = banios;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ProyectoConstruccion getProyecto() {
        return proyecto;
    }

    public void setProyecto(ProyectoConstruccion proyecto) {
        this.proyecto = proyecto;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean estaDisponible(){
    return estado.equalsIgnoreCase("Disponible");
    }
    
    public void vender(){
    estado = "Vendido";
    }
    
    public void reservar(){
    estado = "Reservado";
    }
    
    @Override
    public String toString(){
    return numero;
    }
}
