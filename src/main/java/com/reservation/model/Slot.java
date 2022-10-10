package com.reservation.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name="SLOT")
public class Slot {
    Timestamp[] startTime;
    Timestamp[] endTime;
    boolean[] isBooked;
    Timestamp addTo;
    Timestamp subtractFrom;
}
