package com.beboldervacation.domain.repository;

import com.beboldervacation.domain.Employee;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    Optional<List<Employee>> getByDocument(String document);
    Optional<List<Employee>> getByIdEmployee(Integer id);
    Employee save(Employee employee) throws ParseException;
}
