package com.reservation.model;

import lombok.*;

import javax.persistence.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="PATIENT")
public class Patient {
    @Id
    @Column(name="PATIENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
}
