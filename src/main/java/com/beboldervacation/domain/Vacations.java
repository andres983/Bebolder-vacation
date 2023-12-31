package com.beboldervacation.domain;

import com.beboldervacation.persistence.entity.Empleado;
import com.beboldervacation.persistence.entity.EstadoVacacion;

import javax.persistence.Column;
import java.time.LocalDate;

public class Vacations {
    private Integer id;
    private Integer employeeId;
    private LocalDate applicationDate;
    private Integer daysRequested;
    private LocalDate initialDate;
    private LocalDate withdrawalDate;
    private Integer daysFavor;
    private Integer stateVacationId;
    private Integer requestNumber;
    private Integer userVerifyId;
    private Boolean approved;
    private Empleado employeeVacation;
    private EstadoVacacion stateVacation;
    private Integer requestNotificationId;
    private Integer notificationApprovalRejectionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Integer getDaysRequested() {
        return daysRequested;
    }

    public void setDaysRequested(Integer daysRequested) {
        this.daysRequested = daysRequested;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public Integer getDaysFavor() {
        return daysFavor;
    }

    public void setDaysFavor(Integer daysFavor) {
        this.daysFavor = daysFavor;
    }

    public Integer getStateVacationId() {
        return stateVacationId;
    }

    public void setStateVacationId(Integer stateVacationId) {
        this.stateVacationId = stateVacationId;
    }

    public Integer getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(Integer requestNumber) {
        this.requestNumber = requestNumber;
    }

    public Integer getUserVerifyId() {
        return userVerifyId;
    }

    public void setUserVerifyId(Integer userVerifyId) {
        this.userVerifyId = userVerifyId;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Empleado getEmployeeVacation() {
        return employeeVacation;
    }

    public void setEmployeeVacation(Empleado employeeVacation) {
        this.employeeVacation = employeeVacation;
    }

    public EstadoVacacion getStateVacation() {
        return stateVacation;
    }

    public void setStateVacation(EstadoVacacion stateVacation) {
        this.stateVacation = stateVacation;
    }

    public Integer getRequestNotificationId() {
        return requestNotificationId;
    }

    public void setRequestNotificationId(Integer requestNotificationId) {
        this.requestNotificationId = requestNotificationId;
    }

    public Integer getNotificationApprovalRejectionId() {
        return notificationApprovalRejectionId;
    }

    public void setNotificationApprovalRejectionId(Integer notificationApprovalRejectionId) {
        this.notificationApprovalRejectionId = notificationApprovalRejectionId;
    }
}
