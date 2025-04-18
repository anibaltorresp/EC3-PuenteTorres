package pe.edu.idat.EC3_PuenteTorres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.EC3_PuenteTorres.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    //esto sería un select * from rol where nomrol =:nomrol
    Rol findByNomrol(String nomrol);
}