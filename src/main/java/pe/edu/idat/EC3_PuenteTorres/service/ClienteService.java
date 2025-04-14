package pe.edu.idat.EC3_PuenteTorres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.dto.ClienteDTO;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;
import pe.edu.idat.EC3_PuenteTorres.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar clientes mediante SP
    public List<Cliente> listarClientes() {
        return clienteRepository.listarClientes();
    }

    // Agregar cliente mediante SP
    public void agregarCliente(ClienteDTO clienteDTO) {
        clienteRepository.agregarCliente(
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getDni(),
                clienteDTO.getEmail(),
                clienteDTO.getTelefono()
        );
    }

    // Actualizar cliente mediante SP
    public void actualizarCliente(Integer id, ClienteDTO clienteDTO) {
        clienteRepository.actualizarCliente(
                id,
                clienteDTO.getNombre(),
                clienteDTO.getApellido(),
                clienteDTO.getDni(),
                clienteDTO.getEmail(),
                clienteDTO.getTelefono()
        );
    }

    // Eliminar cliente mediante SP
    public void eliminarCliente(Integer id) {
        clienteRepository.eliminarCliente(id);
    }
}