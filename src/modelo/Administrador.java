
package modelo;

public class Administrador extends Empleado{

    public Administrador(String usuario, String password, String dni, String nombre, String apellido) {
        super(usuario, password, dni, nombre, apellido);
    }

    @Override
    public String conseguirTipo() {
        return "Administrador";
    }
    
}
