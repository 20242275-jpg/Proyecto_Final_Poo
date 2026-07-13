
package modelo;

public abstract class Empleado extends Persona {
    
    private String usuario;
    private String password;

    public Empleado(String usuario, String password, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //El rol ahora se obtiene por polimorfismo
    public String getRol() {
    return conseguirTipo();
    }

    @Override
    public abstract String conseguirTipo();
    
    
}
