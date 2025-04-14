package pe.edu.idat.EC3_PuenteTorres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void actualizarCliente(Integer id, String nombre, String apellido, String dni, String email, String telefono) {
        clienteRepository.actualizarCliente(id, nombre, apellido, dni, email, telefono);
    }
}