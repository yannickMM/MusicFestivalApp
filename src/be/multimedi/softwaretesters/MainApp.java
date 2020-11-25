package be.multimedi.softwaretesters;

import be.multimedi.softwaretesters.instrument.ElectricGuitar;
import be.multimedi.softwaretesters.instrument.Instrument;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class MainApp {
    public static void main(String[] args) {
        Instrument guitar = new ElectricGuitar();
    }
}
