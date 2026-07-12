
package datos;

import modelo.*;


public class BaseDatosMemoria {

    public static Empleado[] empleados = new Empleado[50];

    public static int cantidadEmpleados = 0;

    public static Cliente[] clientes = new Cliente[100];

    public static int cantidadClientes = 0;

    public static boolean registrarEmpleado(Empleado empleado){
        
        if(empleado != null && cantidadEmpleados < empleados.length){

            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
            
            return true;
        }
        return false;
    }

    public static boolean registrarCliente(Cliente cliente){
        
        if(cliente != null && cantidadClientes < clientes.length){

            clientes[cantidadClientes] = cliente;
            cantidadClientes++;

            return true;
        }

        return false;
    }

    public static Empleado obtenerEmpleado(int posicion){

        if(posicion >= 0 && posicion < cantidadEmpleados){
            return empleados[posicion];

        }
        return null;
    }
    public static Cliente obtenerCliente(int posicion){

        if(posicion >= 0 && posicion < cantidadClientes){
            return clientes[posicion];
            
        }
        return null;
    }
}