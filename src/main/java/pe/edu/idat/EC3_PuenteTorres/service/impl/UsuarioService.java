package pe.edu.idat.EC3_PuenteTorres.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.model.Usuario;
import pe.edu.idat.EC3_PuenteTorres.repository.UsuarioRepository;
import pe.edu.idat.EC3_PuenteTorres.service.IUsuarioService;
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
}
