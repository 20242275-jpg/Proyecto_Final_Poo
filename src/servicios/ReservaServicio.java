
package servicios;

import datos.BaseDatosMemoria;
import modelo.Departamento;
import modelo.Reserva;

public class ReservaServicio {

    public boolean registrarReserva(Reserva reserva) {

        if (reserva == null) {
            return false;
        }

        Departamento departamento = reserva.getDepartamento();

        if (departamento == null) {
            return false;
        }

        if (!departamento.estaDisponible()) {
            return false;
        }

        departamento.reservar();

        return BaseDatosMemoria.registrarReserva(reserva);
    }
}