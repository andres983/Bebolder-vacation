package com.beboldervacation.web.controller;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("user/{document}")
    public ResponseEntity<List<Employee>> getByEmployee(@PathVariable("document") String document){
        return employeeService.getByDocument(document)
                .map(employees -> new ResponseEntity<>(employees, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("user/id/{id}")
    public ResponseEntity<List<Employee>> getByEmployeeId(@PathVariable("id") Integer employeeId){
        return employeeService.getByIdEmployee(employeeId)
                .map(employees -> new ResponseEntity<>(employees, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) throws ParseException {
        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.CREATED);
    }

}
