package com.beboldervacation.persistence.crud;

import com.beboldervacation.persistence.entity.Vacaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VacacionCRUDRepository extends CrudRepository<Vacaciones, Integer> {

    Optional<List<Vacaciones>> findByIdEmpleado(Integer idEmpleado);
}
