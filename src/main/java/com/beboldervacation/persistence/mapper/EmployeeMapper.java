package com.beboldervacation.persistence.mapper;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.persistence.entity.Empleado;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "idEmpleado", target = "employeeId"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "idTipoDocumento", target = "documentTypeId"),
            @Mapping(source = "documento", target = "document"),
            @Mapping(source = "nombres", target = "names"),
            @Mapping(source = "apellidos", target = "surnames"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "direccion", target = "addres"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "fechaIngreso", target = "admissionDate"),
            @Mapping(source = "fechaRetiro", target = "withdrawalDate"),
            @Mapping(source = "idTipoContrato", target = "contractTypeId"),
            @Mapping(source = "idTipoCargo", target = "typeChargeId"),
            @Mapping(source = "idEstado", target = "statusId"),
            @Mapping(source = "supervisorInmediato", target = "immediateSupervisor"),
    })
    Employee toEmployee(Empleado empleado);

    List<Employee> toEmployees(List<Empleado> empleados);

    @InheritInverseConfiguration
    @Mappings({
    @Mapping(target = "vacaciones", ignore = true),
            @Mapping(target = "notificaciones", ignore = true),
            @Mapping(target = "tipoDocumento", ignore = true),
            @Mapping(target = "tipoCargo", ignore = true),
            @Mapping(target = "tipoContrato", ignore = true),
            @Mapping(target = "estadoEmpleado", ignore = true),
    })
    Empleado toEmpleado(Employee employee);

}
