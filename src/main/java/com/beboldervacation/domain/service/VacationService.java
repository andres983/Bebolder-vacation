package com.beboldervacation.domain.service;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.Vacations;
import com.beboldervacation.domain.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
public class VacationService {

    @Autowired
    private VacationRepository vacationRepository;

    public Optional<List<Vacations>> getByIdEmployee(Integer idEmpleado ) {
        return vacationRepository.getByIdEmpleado(idEmpleado);
    }

    public Vacations save(Vacations vacation) throws ParseException {
        return vacationRepository.save(vacation);
    }
}
