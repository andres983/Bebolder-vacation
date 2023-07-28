package com.beboldervacation.domain;

import com.beboldervacation.persistence.entity.Vacaciones;

import java.util.List;

public class VacationState {
    private Integer id;
    private String name;
    private String description;
    private List<Vacations> vacations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Vacations> getVacations() {
        return vacations;
    }

    public void setVacations(List<Vacations> vacations) {
        this.vacations = vacations;
    }
}
