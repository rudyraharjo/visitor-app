package com.visitors.visitorapp.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "visitor")
public class Visitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String temperature;

    @Column(name = "datetime_in", columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date datetime_in;

    @Column(name = "datetime_out", columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date datetime_out;

    @ManyToOne
    private Building building;

    public Visitor() {
    }

    public Visitor(
            Long id,
            String name,
            String email,
            String phone,
            String temperature,
            Date datetime_in,
            Date datetime_out) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.temperature = temperature;
        this.datetime_in = datetime_in;
        this.datetime_out = datetime_out;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Date getDatetime_in() {
        return datetime_in;
    }

    public void setDatetime_in(Date datetime_in) {
        this.datetime_in = datetime_in;
    }

    public Date getDatetime_out() {
        return datetime_out;
    }

    public void setDatetime_out(Date datetime_out) {
        this.datetime_out = datetime_out;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
