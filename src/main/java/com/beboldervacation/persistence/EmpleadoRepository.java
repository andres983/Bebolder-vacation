package com.beboldervacation.persistence;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmpleadoRepository implements EmployeeRepository {

    private EmpleadoRepository empleadoRepository;
    @Override
    public Optional<List<Employee>> getByDocument(String document) {
        return Optional.empty();
    }

    @Override
    public Employee save(Employee employee) {
        
        return empleadoRepository.save(employee);
    }
}
