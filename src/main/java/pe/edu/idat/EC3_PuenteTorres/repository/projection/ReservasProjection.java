package pe.edu.idat.EC3_PuenteTorres.repository.projection;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public interface ReservasProjection {

    Integer getReserva_id();

    String getCliente();

    String getApellido();

    Integer getHabitacion();

    Date getFecha_entrada();

    Date getFecha_salida();

    String getEstado();
}
