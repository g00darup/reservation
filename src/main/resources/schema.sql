CREATE TABLE DOCTOR(
  EMPLOYEE_ID BIGSERIAL PRIMARY KEY,
  FIRST_NAME VARCHAR(16) NOT NULL,
  LAST_NAME VARCHAR(16) NOT NULL,
  EMAIL VARCHAR(36)
);

CREATE TABLE PATIENT(
  PATIENT_ID BIGSERIAL PRIMARY KEY,
  FIRST_NAME VARCHAR(16) NOT NULL,
  LAST_NAME VARCHAR(16) NOT NULL
);


CREATE TABLE APPOINTMENT(
  APPOINTMENT_ID BIGSERIAL PRIMARY KEY
);


CREATE TABLE CALENDAR(
  CALENDAR_ID BIGSERIAL PRIMARY KEY
);

CREATE TABLE RESERVATION(
  RESERVATION_ID BIGSERIAL PRIMARY KEY
);