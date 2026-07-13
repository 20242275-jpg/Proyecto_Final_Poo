    
package interfaz;

import datos.Inicializador;
import servicios.LoginServicio;
import modelo.Empleado;

public class App {

    public static void main(String[] args) {

        Inicializador.cargarDatos();

        LoginServicio login = new LoginServicio();

        Empleado usuario = login.validarUsuario("admin", "123");

        if (usuario != null) {

            System.out.println("Ingreso correcto");
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Rol: " + usuario.conseguirTipo());

        } else {

            System.out.println("Usuario incorrecto");

        }

    }

}