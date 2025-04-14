package pe.edu.idat.EC3_PuenteTorres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.EC3_PuenteTorres.dto.ClienteDTO;
import pe.edu.idat.EC3_PuenteTorres.model.Cliente;
import pe.edu.idat.EC3_PuenteTorres.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Void> agregarCliente(@RequestBody ClienteDTO clienteDTO) {
        clienteService.agregarCliente(clienteDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        clienteService.actualizarCliente(id, clienteDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Integer id) {
        clienteService.eliminarCliente(id);
        return ResponseEntity.ok().build();
    }
}
