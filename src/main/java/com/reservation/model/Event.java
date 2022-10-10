package com.reservation.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashMap;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name="EVENT")
public class Event {
    String eventId;
    String eventName;
    HashMap<String,String> participants;
}
