package com.reservation.model;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="APPOINTMENT")
public class Appointment {
    @Id
    @Column(name="APPOINTMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    //@OneToOne(cascade = CascadeType.PERSIST)
    @Transient
    Doctor doctor;
    @Transient
    Calendar calendar;
    @Transient
    Slot slot;
}
