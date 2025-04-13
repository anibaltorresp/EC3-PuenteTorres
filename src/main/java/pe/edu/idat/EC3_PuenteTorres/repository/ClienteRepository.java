package pe.edu.idat.EC3_PuenteTorres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
