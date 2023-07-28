package com.beboldervacation.domain.repository;

import com.beboldervacation.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    Optional<List<Employee>> getByDocument(String document);
    Employee save(Employee employee);
}
