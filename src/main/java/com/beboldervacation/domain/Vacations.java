package com.beboldervacation.domain;

import java.util.Date;

public class Vacations {
    private Integer id;
    private Integer EmployeeId;
    private Date applicationDate;
    private Integer daysRequested;
    private Integer daysFavor;
    private Integer stateVacationId;
    private Integer requestNumber;
    private Date withdrawalDate;
    private Integer userVerifyId;
    private boolean approved;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Integer getDaysRequested() {
        return daysRequested;
    }

    public void setDaysRequested(Integer daysRequested) {
        this.daysRequested = daysRequested;
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

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public Integer getUserVerifyId() {
        return userVerifyId;
    }

    public void setUserVerifyId(Integer userVerifyId) {
        this.userVerifyId = userVerifyId;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
