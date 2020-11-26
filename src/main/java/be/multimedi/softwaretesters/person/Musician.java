package be.multimedi.softwaretesters.person;

import be.multimedi.softwaretesters.instrument.Instrument;

import java.time.LocalDate;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Musician extends Employee {
    private Instrument instrument;

    public Musician() {
    }

    public Musician(Instrument instrument) {
        super();
        this.instrument = instrument;
    }

    public Musician(double hourlyWage, Instrument instrument) {
        super(hourlyWage);
        this.instrument = instrument;
    }

    public Musician(String firstName, String surname, LocalDate dateOfBirth, double hourlyWage, Instrument instrument) {
        super(firstName, surname, dateOfBirth, hourlyWage);
        this.instrument = instrument;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform(){
        getInstrument().play();
    }
}
