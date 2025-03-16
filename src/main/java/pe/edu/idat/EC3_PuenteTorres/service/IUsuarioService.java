package pe.edu.idat.EC3_PuenteTorres.service;

import pe.edu.idat.EC3_PuenteTorres.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    Usuario obtenerUsuarioxNomusuario(String nomusuario); // Ya existe

    // Métodos CRUD
    List<Usuario> listarUsuarios(); // GET
    Optional<Usuario> obtenerUsuarioPorId(Integer id); // GET por ID
    Usuario guardarUsuario(Usuario usuario); // POST
    Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado); // PUT
    void eliminarUsuario(Integer id); // DELETE
}
