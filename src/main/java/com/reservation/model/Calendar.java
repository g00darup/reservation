package com.reservation.model;

import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.TimeZone;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="CALENDAR")
public class Calendar {
    @Id
    @Column(name="CALENDAR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;
    @Transient
    DayOfWeek dayOfWeek;
    @Transient
    TimeZone timeZone;
    @Transient
    LocalDateTime localDateTime;
}
