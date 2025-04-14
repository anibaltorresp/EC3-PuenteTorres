package pe.edu.idat.EC3_PuenteTorres.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.idat.EC3_PuenteTorres.model.Reserva;
import pe.edu.idat.EC3_PuenteTorres.repository.ReservaRepository;
import pe.edu.idat.EC3_PuenteTorres.repository.projection.ReservasProjection;
import pe.edu.idat.EC3_PuenteTorres.service.ReservaService;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva obtenerPorId(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva registrar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva actualizar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public void eliminar(Integer id) {
        reservaRepository.deleteById(id);
    }

    // 🔹 Nuevo método usando la proyección con JOINs
    @Override
    public List<ReservasProjection> listarReservasActivas() {
        return reservaRepository.obtenerReservasActivas();
    }
}