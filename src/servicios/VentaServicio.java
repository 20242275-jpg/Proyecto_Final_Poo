
package servicios;

import datos.BaseDatosMemoria;
import modelo.Departamento;
import modelo.Reserva;
import modelo.Venta;

public class VentaServicio {

    public boolean registrarVenta(Venta venta) {

        if (venta == null) {
            return false;
        }

        Departamento departamento = venta.getDepartamento();

        if (departamento == null) {
            return false;
        }

        // Solo se puede vender si estaba reservado
        if (!departamento.getEstado().equalsIgnoreCase("Reservado")) {
            return false;
        }

        // Cambiar estado del departamento
        departamento.vender();

        // Desactivar la reserva asociada
        for (int i = 0; i < BaseDatosMemoria.cantidadReservas; i++) {

            Reserva reserva = BaseDatosMemoria.reservas[i];

            if (reserva != null
                    && reserva.getDepartamento().getCodigo().equals(departamento.getCodigo())
                    && reserva.estaActiva()) {

                reserva.desactivar();
                break;
            }
        }

        return BaseDatosMemoria.registrarVenta(venta);
    }

}