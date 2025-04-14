package pe.edu.idat.EC3_PuenteTorres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;
import pe.edu.idat.EC3_PuenteTorres.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PutMapping("/{id}")
    public void actualizarCliente(
            @PathVariable Integer id,
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String dni,
            @RequestParam String email,
            @RequestParam String telefono
    ) {
        clienteService.actualizarCliente(id, nombre, apellido, dni, email, telefono);
    }
}