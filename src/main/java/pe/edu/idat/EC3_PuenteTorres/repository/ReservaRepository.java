package pe.edu.idat.EC3_PuenteTorres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.EC3_PuenteTorres.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}