
package datos;

import modelo.Empleado;

public class Inicializador {
    
    public static void cargarDatos(){
        
        Empleado admin = new Empleado( "12345678", "Administrador", "General", "admin", "123", "Administrador");
        
        BaseDatosMemoria.registrarEmpleado(admin);
    }
}
