package com.beboldervacation.domain.repository;

import com.beboldervacation.domain.Vacations;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface VacationRepository {

    Optional<List<Vacations>> getByIdEmpleado(Integer idEmpleado);
    Vacations save(Vacations vacations) throws ParseException;
}
