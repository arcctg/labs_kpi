package lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Patient {
    private int patientId; // PK
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String contactNumber;
    private String address;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class MedicalRecord {
    private int recordId; // PK
    private int patientId; // FK
    private LocalDateTime dateCreated;
    private String bloodType;
    private String allergies;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Department {
    private int departmentId; // PK
    private String name;
    private String location;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Doctor {
    private int doctorId; // PK
    private int departmentId; // FK
    private String firstName;
    private String lastName;
    private String specialization;
    private String schedule;
    private LocalDate hireDate;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Appointment {
    private int appointmentId; // PK
    private int patientId; // FK
    private int doctorId; // FK
    private LocalDateTime date;
    private String status;
    private String reason;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Treatment {
    private int treatmentId; // PK
    private int recordId; // FK
    private LocalDate date;
    private String diagnosis;
    private String description;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Medication {
    private int medicationId; // PK
    private String name;
    private String description;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class MedicalTeam {
    private int doctorId; // PK, FK
    private int treatmentId; // PK, FK
    private String role;
}

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
class Prescription {
    private int treatmentId; // PK, FK
    private int medicationId; // PK, FK
    private String dosage;
    private String frequency;
    private String duration;
}
