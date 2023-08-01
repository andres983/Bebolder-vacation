package com.beboldervacation.web.controller;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.Vacations;
import com.beboldervacation.domain.service.EmployeeService;
import com.beboldervacation.domain.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/vacation")
public class VacationController {

    @Autowired
    private VacationService vacationService;

    @GetMapping("user/{idEmployee}")
    public ResponseEntity<List<Vacations>> getByEmployee(@PathVariable("idEmployee") Integer idEmployee){
        return vacationService.getByIdEmployee(idEmployee)
                .map(vacations -> new ResponseEntity<>(vacations, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Vacations> save(@RequestBody Vacations vacation) throws ParseException {
        return new ResponseEntity<>(vacationService.save(vacation), HttpStatus.CREATED);
    }

}