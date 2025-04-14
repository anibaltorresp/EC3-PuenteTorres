package pe.edu.idat.EC3_PuenteTorres.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.EC3_PuenteTorres.model.Reserva;
import pe.edu.idat.EC3_PuenteTorres.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public ResponseEntity<List<Reserva>> listarReservas() {
        return ResponseEntity.ok(reservaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> obtenerReserva(@PathVariable Integer id) {
        Reserva reserva = reservaService.obtenerPorId(id);
        if (reserva == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(reserva);
    }

    @PostMapping
    public ResponseEntity<Reserva> registrarReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.registrar(reserva));
    }

    @PutMapping
    public ResponseEntity<Reserva> actualizarReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.actualizar(reserva));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReserva(@PathVariable Integer id) {
        reservaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}