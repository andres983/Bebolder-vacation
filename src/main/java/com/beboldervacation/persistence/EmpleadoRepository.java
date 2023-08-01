package com.beboldervacation.persistence;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.repository.EmployeeRepository;
import com.beboldervacation.persistence.Util.UtilDate;
import com.beboldervacation.persistence.crud.EmpleadoCRUDRepository;
import com.beboldervacation.persistence.entity.Empleado;
import com.beboldervacation.persistence.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class EmpleadoRepository implements EmployeeRepository {

    @Autowired
    private EmpleadoCRUDRepository empleadoCRUDRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Optional<List<Employee>> getByDocument(String document) {
        Optional<List<Empleado>> empleados = empleadoCRUDRepository.findByDocumento(document);
        return empleados.map(empleado -> employeeMapper.toEmployees(empleado));
    }

    @Override
    public Optional<List<Employee>> getByIdEmployee(Integer id) {
        Optional<List<Empleado>> empleados = empleadoCRUDRepository.findByIdEmpleado(id);
        return empleados.map(empleado -> employeeMapper.toEmployees(empleado));
    }

    @Override
    public Employee save(Employee employee) throws ParseException {
        LocalDate fechaIngreso = UtilDate.convertStringToDate(employee.getAdmissionDate());
        Empleado empleado = employeeMapper.toEmpleado(employee);
        empleado.setFechaIngreso(fechaIngreso);
        return employeeMapper.toEmployee(empleadoCRUDRepository.save(empleado));
    }
}
