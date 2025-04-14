package pe.edu.idat.EC3_PuenteTorres.service;

import pe.edu.idat.EC3_PuenteTorres.model.Reserva;

import java.util.List;

public interface ReservaService {
    List<Reserva> listar();
    Reserva obtenerPorId(Integer id);
    Reserva registrar(Reserva reserva);
    Reserva actualizar(Reserva reserva);
    void eliminar(Integer id);
}