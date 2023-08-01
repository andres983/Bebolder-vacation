package com.beboldervacation.persistence;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.Vacations;
import com.beboldervacation.domain.repository.VacationRepository;
import com.beboldervacation.domain.service.EmployeeService;
import com.beboldervacation.persistence.crud.VacacionCRUDRepository;
import com.beboldervacation.persistence.entity.Vacaciones;
import com.beboldervacation.persistence.mapper.VacationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Repository
public class VacacionRepository implements VacationRepository {

    @Autowired
    private VacacionCRUDRepository vacacionCRUDRepository;
    @Autowired
    private VacationMapper vacationMapper;
    @Autowired
    private EmployeeService employeeService;


    @Override
    public Optional<List<Vacations>> getByIdEmpleado(Integer idEmpleado) {
        Optional<List<Vacaciones>> vacaciones = vacacionCRUDRepository.findByIdEmpleado(idEmpleado);
        return vacaciones.map(vacacion -> vacationMapper.toVacationList(vacacion));
    }

    @Override
    public Vacations save(Vacations vacations) throws ParseException {

        Vacations vacationData = new Vacations();

        System.out.println("employeeId " + vacations.getEmployeeId());
        System.out.println("applicationDate " + vacations.getApplicationDate());
        System.out.println("daysFavor " + vacations.getDaysFavor());
        System.out.println("daysRequested " + vacations.getDaysRequested());
        System.out.println("stateVacationId " + vacations.getStateVacationId());
        System.out.println("requestNumber " + vacations.getRequestNumber());
        System.out.println("withdrawalDate " + vacations.getWithdrawalDate());
        System.out.println("userVerifyId " + vacations.getUserVerifyId());
        System.out.println("approved " + vacations.isApproved());

        try {
            Employee employees = getEmployeeById(vacations.getEmployeeId());
            vacationData = getDataInfoVacation(employees.getEmployeeId());




        } catch (Exception exception) {

        }

        return null;
    }

    public Employee getEmployeeById(Integer id) {

        Employee employeeData = new Employee();

        try {
            Optional<List<Employee>> employees = employeeService.getByIdEmployee(id);
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

    public Vacations getDataInfoVacation(Integer id) {

        Vacations vacationData = new Vacations();

        try {
            Optional<List<Vacations>> vacations = this.getByIdEmpleado(id);

            if (vacations.isPresent()) {

                List<Vacations> vacationsList = vacations.get();

                for (Vacations vacation : vacationsList) {
                    vacationData.setId(vacation.getId());
                    vacationData.setEmployeeId(vacation.getEmployeeId());
                    vacationData.setApplicationDate(vacation.getApplicationDate());
                    vacationData.setDaysRequested(vacation.getDaysRequested());
                    vacationData.setDaysFavor(vacation.getDaysFavor());
                    vacationData.setStateVacationId(vacation.getStateVacationId());
                    vacationData.setRequestNumber(vacation.getRequestNumber());
                    vacationData.setWithdrawalDate(vacation.getWithdrawalDate());
                    vacationData.setUserVerifyId(vacation.getUserVerifyId());
                    vacationData.setApproved(vacation.isApproved());

                }

            } else {
                throw new Exception("No se encontro datos de vacacion por el usuario solicitado");
            }
            return vacationData;

        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
