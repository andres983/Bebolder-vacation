package com.beboldervacation.persistence.mapper;

import com.beboldervacation.domain.Vacations;
import com.beboldervacation.persistence.entity.Vacaciones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VacationMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idEmpleado", target = "employeeId"),
            @Mapping(source = "fechaSolicitud", target = "applicationDate"),
            @Mapping(source = "diasSolicitados", target = "daysRequested"),
            @Mapping(source = "fechaInicial", target = "initialDate"),
            @Mapping(source = "fechaReintrego", target = "withdrawalDate"),
            @Mapping(source = "diasAFavor", target = "daysFavor"),
            @Mapping(source = "idEstadoVacacion", target = "stateVacationId"),
            @Mapping(source = "numeroSolicitud", target = "requestNumber"),
            @Mapping(source = "idUsuarioVerifico", target = "userVerifyId"),
            @Mapping(source = "aprobado", target = "approved"),
            @Mapping(source = "idNotificacionSolicitud", target = "requestNotificationId"),
            @Mapping(source = "idNotificacionAprobacionRechazo", target = "notificationApprovalRejectionId"),

    })
    Vacations toVacation(Vacaciones vacaciones);

    List<Vacations> toVacationList(List<Vacaciones> vacaciones);

    @InheritInverseConfiguration
    Vacaciones toVacacion(Vacations vacations);


}
