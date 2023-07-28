package com.beboldervacation.persistence.mapper;

import com.beboldervacation.domain.Vacations;
import com.beboldervacation.persistence.entity.Vacaciones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VacationMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idEmpleado", target = "employeeId"),
            @Mapping(source = "fechaSolicitud", target = "applicationDate"),
            @Mapping(source = "diasSolicitados", target = "daysRequested"),
            @Mapping(source = "diasAFavor", target = "daysFavor"),
            @Mapping(source = "idEstadoVacacion", target = "stateVacationId"),
            @Mapping(source = "numeroSolicitud", target = "requestNumber"),
            @Mapping(source = "fechaReintrego", target = "withdrawalDate"),
            @Mapping(source = "idUsuarioVerifico", target = "userVerifyId"),
            @Mapping(source = "aprobado", target = "approved"),
            @Mapping(source = "empleadoVacacion", target = "employeeVacation"),
            @Mapping(source = "estadoVacacion", target = "stateVacation"),

    })
    Vacations toVacations(Vacaciones vacaciones);

    @InheritInverseConfiguration
    Vacaciones toVacaciones(Vacations vacations);


}
