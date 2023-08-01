package com.beboldervacation.domain.util;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeUtil {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeUtil(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee getEmployeeById(Integer id) {

        Employee employeeData = new Employee();

        try {
            Optional<List<Employee>> employees = employeeService.getByIdEmployee(id);

                System.out.println(">>>>>>>>>>>>>>>>>>> " + employees.get());

            if (employees.isPresent()) {
                List<Employee> employeeList = employees.get();

                for (Employee employee : employeeList) {
                    employeeData.setEmployeeId(employee.getEmployeeId());
                    employeeData.setUser(employee.getUser());
                    employeeData.setDocumentTypeId(employee.getDocumentTypeId());
                    employeeData.setDocument(employee.getDocument());
                    employeeData.setNames(employee.getNames());
                    employeeData.setSurnames(employee.getSurnames());
                    employeeData.setPhone(employee.getPhone());
                    employeeData.setAddres(employee.getAddres());
                    employeeData.setEmail(employee.getEmail());
                    employeeData.setAdmissionDate(employee.getAdmissionDate());
                    employeeData.setWithdrawalDate(employee.getWithdrawalDate());
                    employeeData.setContractTypeId(employee.getContractTypeId());
                    employeeData.setTypeChargeId(employee.getTypeChargeId());
                    employeeData.setStatusId(employee.getStatusId());
                    employeeData.setImmediateSupervisor(employee.getImmediateSupervisor());
                }

            } else {
                throw new Exception("No se encontro empleado por el id solicitado");
            }

            return employeeData;

        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

}
