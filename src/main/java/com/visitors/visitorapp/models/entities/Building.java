package com.visitors.visitorapp.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "ms_building")
public class Building implements Serializable {
    @Id
    @SequenceGenerator(
            name = "building_sequence",
            sequenceName = "building_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "building_sequence"
    )

    private Long id;
    private String name;
    private String capacity;
    private String telephone;

    @Column(name = "time_visit_f", columnDefinition = "TIME")
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mm:ss")
    private Date timevisit_f;

    @Column(name = "datetime_visit_t", columnDefinition = "TIME")
    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mm:ss")
    private Date timevisit_t;

    private Integer timevisit;


    public Building() {
    }

    public Building(Long id, String name, String capacity, String telephone, Date timevisit_f, Date timevisit_t, Integer timevisit) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.telephone = telephone;
        this.timevisit_f = timevisit_f;
        this.timevisit_t = timevisit_t;
        this.timevisit = timevisit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getTimevisit_f() {
        return timevisit_f;
    }

    public void setTimevisit_f(Date timevisit_f) {
        this.timevisit_f = timevisit_f;
    }

    public Date getTimevisit_t() {
        return timevisit_t;
    }

    public void setTimevisit_t(Date timevisit_t) {
        this.timevisit_t = timevisit_t;
    }

    public Integer getTimevisit() {
        return timevisit;
    }

    public void setTimevisit(Integer timevisit) {
        this.timevisit = timevisit;
    }
}
