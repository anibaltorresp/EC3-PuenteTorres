package pe.edu.idat.EC3_PuenteTorres.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;
import pe.edu.idat.EC3_PuenteTorres.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente buscar(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}