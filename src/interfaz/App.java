
package interfaz;

import datos.Inicializador;
import servicios.LoginServicio;
import modelo.Empleado;

public class App {
    public static void main(String[] args){
        // Cargar datos iniciales
        Inicializador.cargarDatos();
        // Crear servicio login
        LoginServicio login = new LoginServicio();
        // Probar usuario correcto
        Empleado usuario = login.validarUsuario("admin","123");
        if(usuario != null){
            
            System.out.println("Ingreso correcto");
            System.out.println("Nombre: "+ usuario.getNombre());
            System.out.println("Rol: "+ usuario.getRol());
            
            usuario.mostrarDatos();
            
        }else{
            System.out.println("Usuario incorrecto");
        }
    }
}