package com.reservation.model;

import lombok.*;

import javax.persistence.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="DOCTOR")
public class Doctor {
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Column(name="EMAIL")
    private String email;
}
