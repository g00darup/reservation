package com.reservation.model;

import javax.persistence.*;

@Entity
@Table(name="PATIENT")
public class Patient {

    public Patient(Long patientId, String firstName, String lastName) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Patient() {
    }

    @Id
    @Column(name="PATIENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
