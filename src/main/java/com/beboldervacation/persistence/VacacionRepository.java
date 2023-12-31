package com.beboldervacation.persistence;

import com.beboldervacation.domain.Employee;
import com.beboldervacation.domain.Notification;
import com.beboldervacation.domain.Vacations;
import com.beboldervacation.domain.repository.VacationRepository;
import com.beboldervacation.domain.service.EmployeeService;
import com.beboldervacation.domain.util.BusinessDaysUtil;
import com.beboldervacation.domain.util.EmployeeUtil;
import com.beboldervacation.domain.util.NotificationEstates;
import com.beboldervacation.domain.util.VacationEstates;
import com.beboldervacation.persistence.Util.Constantes;
import com.beboldervacation.persistence.Util.Destinatarios;
import com.beboldervacation.persistence.Util.UtilDate;
import com.beboldervacation.persistence.crud.NotificacionCRUDRepository;
import com.beboldervacation.persistence.crud.VacacionCRUDRepository;
import com.beboldervacation.persistence.entity.Notificacion;
import com.beboldervacation.persistence.entity.Vacaciones;
import com.beboldervacation.persistence.mapper.NotificationMapper;
import com.beboldervacation.persistence.mapper.VacationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
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
    private NotificationMapper notificationMapper;
    @Autowired
    private NotificacionCRUDRepository notificacionCRUDRepository;
    @Autowired
    private EmployeeService employeeService;


    @Override
    public Optional<List<Vacations>> getByIdEmpleado(Integer idEmpleado) {
        Optional<List<Vacaciones>> vacaciones = vacacionCRUDRepository.findByIdEmpleado(idEmpleado);
        return vacaciones.map(vacation -> vacationMapper.toVacationList(vacation));
    }

    @Transactional
    @Override
    public Vacations save(Vacations vacations) throws ParseException {

        Vacations vacationData = new Vacations();
        Vacations vacationSave = new Vacations();
        Notificacion notificacion = new Notificacion();
        Notification notificationSave = new Notification();
        Employee employee = new Employee();
        EmployeeUtil employeeUtil = new EmployeeUtil(employeeService);

        try {

            employee = employeeUtil.getEmployeeById(vacations.getEmployeeId());

            if (employee.getEmployeeId() != null) {

                vacationData = getDataInfoVacation(employee.getEmployeeId());

                if (vacationData.getId() != null) {
                    System.out.println("vacationData >>>>> " + vacationData.getId());

                    // TO DO ****************

                } else {
                    //Primer registro de solicitud de vacaciones **
                    Vacaciones vacacion = vacationMapper.toVacacion(vacations);

                    Integer diasHabilesSolicitados = BusinessDaysUtil.calcularDiasHabiles(vacacion.getFechaInicial().toString(), vacacion.getFechaReintrego().toString());

                    vacacion.setIdEmpleado(employee.getEmployeeId());
                    vacacion.setFechaSolicitud(UtilDate.currentDate());
                    vacacion.setDiasAFavor(Constantes.VALUE_CERO.getValor());
                    vacacion.setIdEstadoVacacion(VacationEstates.SOLICITADA.getValor());
                    vacacion.setNumeroSolicitud(Constantes.VALUE_CERO.getValor());
                    vacacion.setDiasSolicitados(diasHabilesSolicitados);
                    vacacion.setIdUsuarioVerifico(null);
                    vacacion.setAprobado(false);

                    vacationSave = vacationMapper.toVacation(vacacionCRUDRepository.save(vacacion));

                    if (vacationSave.getId() != null) {

                        notificacion.setDestinatarios(Destinatarios.SOLICITUD_VACACIONES.getValor());
                        notificacion.setAsunto("Solicitud de vacaciones de " + employee.getNames() + " " + employee.getSurnames());
                        notificacion.setMensaje("Se solicita vacaciones desde fecha " + vacacion.getFechaInicial() + " hasta la fecha " + vacacion.getFechaReintrego() + " " +
                                "para un total de dias de " + diasHabilesSolicitados);
                        notificacion.setIdTipoNotificacion(NotificationEstates.EMAIL.getValor());

                        notificationSave = notificationMapper.toNotification(notificacionCRUDRepository.save(notificacion));

                        vacacion.setId(vacationSave.getId());
                        vacacion.setIdNotificacionSolicitud(notificationSave.getId());

                        vacationSave = vacationMapper.toVacation(vacacionCRUDRepository.save(vacacion));
                    }

                    return vacationSave;
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public Vacations getDataInfoVacation(Integer id) {

        Vacations vacationData = new Vacations();

        try {
            Optional<List<Vacations>> vacations = getByIdEmpleado(id);

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
                    vacationData.setApproved(vacation.getApproved());
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
