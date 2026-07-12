/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author erick
 */
public class Gerente extends Empleado{

    public Gerente(String usuario, String password, String rol, String dni, String nombre, String apellido) {
        super(usuario, password, "Gerente", dni, nombre, apellido);
    }

    @Override
    public String conseguirTipo() {
        return "Gerente";
    }
    
    
}
