
package modelo;

public class Gerente extends Empleado{

    public Gerente(String usuario, String password, String dni, String nombre, String apellido) {
        super(usuario, password, dni, nombre, apellido);
    }

    @Override
    public String conseguirTipo() {
        return "Gerente";
    }
    
    
}
