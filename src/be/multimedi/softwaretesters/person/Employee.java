package be.multimedi.softwaretesters.person;

import java.time.LocalDate;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Employee extends Person {
    private double hourlyWage;

    public Employee() {
        this(0);
    }

    public Employee(double hourlyWage) {
        super();
        this.hourlyWage = hourlyWage;
    }

    public Employee(String firstName, String surname, LocalDate dateOfBirth, double hourlyWage) {
        super(firstName, surname, dateOfBirth);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
