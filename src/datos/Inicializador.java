
package datos;

import modelo.Administrador;

public class Inicializador {
    
    public static void cargarDatos(){
        
        Administrador admin = new Administrador( "admin", "123", "12345678", "Administrador", "General");
        
        BaseDatosMemoria.registrarEmpleado(admin);
    }
}
