package com.beboldervacation.domain.service;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<List<Employee>> getByDocument(String document) {
        return employeeRepository.getByDocument(document);
    }

    public Optional<List<Employee>> getByIdEmployee(Integer id) {
        return employeeRepository.getByIdEmployee(id);
    }

    public Employee save(Employee employee) throws ParseException {
        return employeeRepository.save(employee);
    }
}


