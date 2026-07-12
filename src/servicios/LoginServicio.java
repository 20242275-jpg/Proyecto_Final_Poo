
package servicios;

import datos.BaseDatosMemoria;
import modelo.Empleado;

public class LoginServicio {
  public Empleado validarUsuario(String usuario, String password){

        for(int i = 0; i < BaseDatosMemoria.cantidadEmpleados; i++){
         Empleado empleado = BaseDatosMemoria.obtenerEmpleado(i);
         
         if(empleado.getUsuario().equals(usuario) && empleado.getPassword().equals(password)){
                return empleado;    
            }
        }
        return null;
    }  
}
