# MySQL Schema Design

## Doctor Table

- doctor_id (INT, PK)
- name (VARCHAR)
- specialty (VARCHAR)

## Patient Table

- patient_id (INT, PK)
- name (VARCHAR)
- age (INT)

## Appointment Table

- appointment_id (INT, PK)
- doctor_id (FK → Doctor)
- patient_id (FK → Patient)
- appointment_time (DATETIME)

## Admin Table

- admin_id (INT, PK)
- username (VARCHAR)
- password (VARCHAR)
