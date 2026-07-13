package datos;

import modelo.*;

public class BaseDatosMemoria {

    // ================= EMPLEADOS =================

    public static Empleado[] empleados = new Empleado[50];
    public static int cantidadEmpleados = 0;

    // ================= CLIENTES =================

    public static Cliente[] clientes = new Cliente[100];
    public static int cantidadClientes = 0;

    // ================= PROYECTOS =================

    public static ProyectoConstruccion[] proyectos = new ProyectoConstruccion[20];
    public static int cantidadProyectos = 0;

    // ================= DEPARTAMENTOS =================

    public static Departamento[] departamentos = new Departamento[100];
    public static int cantidadDepartamentos = 0;

    // ================= RESERVAS =================

    public static Reserva[] reservas = new Reserva[100];
    public static int cantidadReservas = 0;

    // ================= VENTAS =================

    public static Venta[] ventas = new Venta[100];
    public static int cantidadVentas = 0;

    // ================= ACABADOS =================

    public static AcabadoOpcional[] acabados = new AcabadoOpcional[50];
    public static int cantidadAcabados = 0;

    // =====================================================
    // REGISTRAR
    // =====================================================

    public static boolean registrarEmpleado(Empleado empleado) {

        if (empleado != null && cantidadEmpleados < empleados.length) {

            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;

            return true;
        }

        return false;
    }

    public static boolean registrarCliente(Cliente cliente) {

        if (cliente != null && cantidadClientes < clientes.length) {

            clientes[cantidadClientes] = cliente;
            cantidadClientes++;

            return true;
        }

        return false;
    }

    public static boolean registrarProyecto(ProyectoConstruccion proyecto) {

        if (proyecto != null && cantidadProyectos < proyectos.length) {

            proyectos[cantidadProyectos] = proyecto;
            cantidadProyectos++;

            return true;
        }

        return false;
    }

    public static boolean registrarDepartamento(Departamento departamento) {

        if (departamento != null && cantidadDepartamentos < departamentos.length) {

            departamentos[cantidadDepartamentos] = departamento;
            cantidadDepartamentos++;

            return true;
        }

        return false;
    }

    public static boolean registrarReserva(Reserva reserva) {

        if (reserva != null && cantidadReservas < reservas.length) {

            reservas[cantidadReservas] = reserva;
            cantidadReservas++;

            return true;
        }

        return false;
    }

    public static boolean registrarVenta(Venta venta) {

        if (venta != null && cantidadVentas < ventas.length) {

            ventas[cantidadVentas] = venta;
            cantidadVentas++;

            return true;
        }

        return false;
    }

    public static boolean registrarAcabado(AcabadoOpcional acabado) {

        if (acabado != null && cantidadAcabados < acabados.length) {

            acabados[cantidadAcabados] = acabado;
            cantidadAcabados++;

            return true;
        }

        return false;
    }

    // =====================================================
    // OBTENER
    // =====================================================

    public static Empleado obtenerEmpleado(int posicion) {

        if (posicion >= 0 && posicion < cantidadEmpleados) {
            return empleados[posicion];
        }

        return null;
    }

    public static Cliente obtenerCliente(int posicion) {

        if (posicion >= 0 && posicion < cantidadClientes) {
            return clientes[posicion];
        }

        return null;
    }

    public static ProyectoConstruccion obtenerProyecto(int posicion) {

        if (posicion >= 0 && posicion < cantidadProyectos) {
            return proyectos[posicion];
        }

        return null;
    }

    public static Departamento obtenerDepartamento(int posicion) {

        if (posicion >= 0 && posicion < cantidadDepartamentos) {
            return departamentos[posicion];
        }

        return null;
    }

    public static Reserva obtenerReserva(int posicion) {

        if (posicion >= 0 && posicion < cantidadReservas) {
            return reservas[posicion];
        }

        return null;
    }

    public static Venta obtenerVenta(int posicion) {

        if (posicion >= 0 && posicion < cantidadVentas) {
            return ventas[posicion];
        }

        return null;
    }

    public static AcabadoOpcional obtenerAcabado(int posicion) {

        if (posicion >= 0 && posicion < cantidadAcabados) {
            return acabados[posicion];
        }

        return null;
    }

}