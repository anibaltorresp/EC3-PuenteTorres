package pe.edu.idat.EC3_PuenteTorres.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "CALL sp_ListarClientes()", nativeQuery = true)
    List<Cliente> listarClientes();

    @Modifying
    @Transactional
    @Query(value = "CALL sp_AgregarCliente(:p_nombre, :p_apellido, :p_dni, :p_email, :p_telefono)", nativeQuery = true)
    void agregarCliente(
            @Param("p_nombre") String nombre,
            @Param("p_apellido") String apellido,
            @Param("p_dni") String dni,
            @Param("p_email") String email,
            @Param("p_telefono") String telefono
    );

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

    @Modifying
    @Transactional
    @Query(value = "CALL sp_EliminarCliente(:p_id)", nativeQuery = true)
    void eliminarCliente(@Param("p_id") Integer id);
}