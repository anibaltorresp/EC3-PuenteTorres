package pe.edu.idat.EC3_PuenteTorres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.idat.EC3_PuenteTorres.model.Reserva;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    // ✅ Consulta general: todas las reservas
    @Query(value = "SELECT r.id AS reserva_id, c.nombre AS cliente, c.apellido, h.numero AS habitacion, " +
            "r.fecha_entrada, r.fecha_salida, r.estado " +
            "FROM reservas r " +
            "INNER JOIN clientes c ON r.cliente_id = c.id " +
            "INNER JOIN habitaciones h ON r.habitacion_id = h.id",
            nativeQuery = true)
    List<ReservasProjection> obtenerTodasLasReservas();

    // ✅ Consulta filtrada: solo reservas con estado 'Reservada'
    @Query(value = "SELECT r.id AS reserva_id, c.nombre AS cliente, c.apellido, h.numero AS habitacion, " +
            "r.fecha_entrada, r.fecha_salida, r.estado " +
            "FROM reservas r " +
            "INNER JOIN clientes c ON r.cliente_id = c.id " +
            "INNER JOIN habitaciones h ON r.habitacion_id = h.id " +
            "WHERE r.estado = 'Reservada'",
            nativeQuery = true)
    List<ReservasProjection> obtenerReservasActivas();

    // ✅ Interfaz interna de proyección
    interface ReservasProjection {
        Integer getReserva_id();
        String getCliente();
        String getApellido();
        Integer getHabitacion();
        Date getFecha_entrada();
        Date getFecha_salida();
        String getEstado();
    }
}
