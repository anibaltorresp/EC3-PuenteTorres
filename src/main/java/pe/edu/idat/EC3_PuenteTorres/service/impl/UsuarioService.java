package pe.edu.idat.EC3_PuenteTorres.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.model.Usuario;
import pe.edu.idat.EC3_PuenteTorres.repository.UsuarioRepository;
import pe.edu.idat.EC3_PuenteTorres.service.IUsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario obtenerUsuarioxNomusuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Integer id, Usuario usuarioActualizado) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNomusuario(usuarioActualizado.getNomusuario());
            usuario.setEmail(usuarioActualizado.getEmail());
            usuario.setNombres(usuarioActualizado.getNombres());
            usuario.setApellidos(usuarioActualizado.getApellidos());
            usuario.setActivo(usuarioActualizado.getActivo());
            return usuarioRepository.save(usuario);
        }).orElse(null);
    }

    @Override
    public void eliminarUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}