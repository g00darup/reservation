package com.reservation.model;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    @Transient
    String reservationName;
    @Transient
    Appointment appointment;
    @Transient
    Patient patient;
}
