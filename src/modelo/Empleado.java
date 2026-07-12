
package modelo;

public class Empleado extends Persona {
    
    private String usuario;
    private String password;
    private String rol;

    public Empleado(String usuario, String password, String rol, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String conseguirTipo() {
        return "Empleado";
    }
    
    
}
