/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erick
 */
public class Administrador extends Empleado{

    public Administrador(String usuario, String password, String dni, String nombre, String apellido) {
        super(usuario, password, dni, nombre, apellido);
    }

    @Override
    public String conseguirTipo() {
        return "Administrador";
    }
    
}
