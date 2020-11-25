package be.multimedi.softwaretesters.person;

import java.time.LocalDate;
import java.time.Month;

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
}
