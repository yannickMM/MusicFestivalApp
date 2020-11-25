package be.multimedi.softwaretesters.person;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Person {
    private String firstName;
    private String surname;
    private LocalDate dateOfBirth;

    public Person() {
        this("John", "Smith", LocalDate.of(2000, Month.JANUARY, 1));
    }

    public Person(String firstName, String surname, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calcAge() {
        LocalDate today = LocalDate.now();
        long age = ChronoUnit.YEARS.between(dateOfBirth, today);
        return (int) age;
    }

    @Override
    public String toString() {
        return "My name is " + getFirstName() + " " + getSurname() + " and I am " + calcAge() + " years old";
    }
}
