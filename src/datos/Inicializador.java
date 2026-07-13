
package datos;

import modelo.Administrador;
import modelo.Asesor;
import modelo.Gerente;
import modelo.Cliente;
import modelo.ProyectoConstruccion;
import modelo.Departamento;

public class Inicializador {
    
    public static void cargarDatos() {

    // ADMINISTRADOR
    Administrador admin = new Administrador(
            "admin",
            "123",
            "12345678",
            "Administrador",
            "General");

    BaseDatosMemoria.registrarEmpleado(admin);

    // ASESOR
    Asesor asesor = new Asesor(
            "asesor",
            "123",
            "87654321",
            "Juan",
            "Pérez");

    BaseDatosMemoria.registrarEmpleado(asesor);

    // GERENTE
    Gerente gerente = new Gerente(
            "gerente",
            "123",
            "11223344",
            "Carlos",
            "Ramírez");

    BaseDatosMemoria.registrarEmpleado(gerente);

    // CLIENTE
    Cliente cliente = new Cliente(
        "999888777",
        "pedro@gmail.com",
        "44556677",
        "Pedro",
        "Gómez");

    BaseDatosMemoria.registrarCliente(cliente);

    // PROYECTO
    ProyectoConstruccion proyecto = new ProyectoConstruccion(
            "P001",
            "Residencial Los Pinos",
            "Av. Principal 123",
            "Lima",
            10,
            "01/01/2025",
            "31/12/2025",
            "En Construcción");

    BaseDatosMemoria.registrarProyecto(proyecto);

    // DEPARTAMENTO
    Departamento departamento = new Departamento(
            "D001",
            proyecto,
            2,
            "201",
            85.5,
            3,
            2,
            "Flat",
            250000,
            "Disponible");

    BaseDatosMemoria.registrarDepartamento(departamento);

}
}
