
package modelo;

public class Asesor extends Empleado{
    
    public Asesor(String usuario, String password, String dni, String nombre, String apellido) {
        super(usuario, password, dni, nombre, apellido);
    }

    @Override
    public String conseguirTipo() {
        return "Asesor";
    }

}
