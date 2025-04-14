package pe.edu.idat.EC3_PuenteTorres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Modifying
    @Transactional
    @Query(value = "CALL sp_ActualizarCliente(:p_id, :p_nombre, :p_apellido, :p_dni, :p_email, :p_telefono)", nativeQuery = true)
    void actualizarCliente(
            @Param("p_id") Integer id,
            @Param("p_nombre") String nombre,
            @Param("p_apellido") String apellido,
            @Param("p_dni") String dni,
            @Param("p_email") String email,
            @Param("p_telefono") String telefono
    );
}
