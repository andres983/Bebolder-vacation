package com.beboldervacation.persistence.crud;

import com.beboldervacation.persistence.entity.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoCRUDRepository extends CrudRepository<Empleado, Integer> {

    Optional<List<Empleado>>findByDocumento(String documento);
    Optional<List<Empleado>>findByIdEmpleado(Integer idEmpleado);

}
