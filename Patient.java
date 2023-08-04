package Hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Patient {
    private String name;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String employeeRelation;

    public Patient(String name, LocalDate admissionDate, LocalDate dischargeDate, String employeeRelation) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.employeeRelation = employeeRelation;
    }

    public long getDaysStayed() {
        return ChronoUnit.DAYS.between(admissionDate, dischargeDate);
    }

    public String getEmployeeRelation() {
        return employeeRelation;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient " +
                "name='" + name + '\'' +
                ", admissionDate=" + admissionDate +
                ", dischargeDate=" + dischargeDate +
                ", employeeRelation='" + employeeRelation + '\''
                ;
    }
}