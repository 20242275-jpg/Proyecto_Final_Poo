
package modelo;

public abstract class Persona {
    
    protected String dni;
    protected String nombre;
    protected String apellido;

    public Persona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;   
    }
    public String getNombreCompleto() {
    return nombre + " " + apellido;
    }
    
    public abstract String conseguirTipo();
    
    public void mostrarDatos(){

    imprimir(
        "DNI: " + dni + 
        "\nNombre: " + getNombreCompleto() +
        "\nTipo: " + conseguirTipo()
    );

    }
    public void imprimir(String cadena){
        System.out.println(cadena);
    }
}
