package be.multimedi.softwaretesters;

import be.multimedi.softwaretesters.instrument.Clarinet;
import be.multimedi.softwaretesters.instrument.ElectricGuitar;
import be.multimedi.softwaretesters.instrument.Instrument;
import be.multimedi.softwaretesters.person.Band;
import be.multimedi.softwaretesters.person.Musician;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class MainApp {
    public static void main(String[] args) {
        Instrument guitar = new ElectricGuitar();
        Instrument clarinet = new Clarinet();

        List<Musician> a7x = new ArrayList<>();
        a7x.add(new Musician("Harrison", "Lavelle",
                LocalDate.of(2020, Month.JANUARY, 1),
                50, guitar));
        a7x.add(new Musician("Joe", "Kent",
                LocalDate.of(2020, Month.JANUARY, 1),
                80, guitar));
        a7x.add(new Musician("Tom", "Josh",
                LocalDate.of(2020, Month.JANUARY, 1),
                50, guitar));
        a7x.add(new Musician("Michael", "Clinton",
                LocalDate.of(2020, Month.JANUARY, 1),
                80, clarinet));
        Band avengedSevenfold = new Band("Avenged Sevenfold", a7x);

        List<Musician> rhcp = new ArrayList<>();
        rhcp.add(new Musician("Kerry", "Hargreaves",
                LocalDate.of(2020, Month.JANUARY, 1),
                50, guitar));
        rhcp.add(new Musician("Simon", "Cowley",
                LocalDate.of(2020, Month.JANUARY, 1),
                80, guitar));

        Band redHotChilliPeppers = new Band("Red Hot Chili Peppers", rhcp);

        List<Musician> gorillaz = new ArrayList<>();
        gorillaz.add(new Musician("Damon", "Albarn",
                LocalDate.of(2020, Month.JANUARY, 1),
                50, guitar));
        gorillaz.add(new Musician("Rosie", "Wilson",
                LocalDate.of(2020, Month.JANUARY, 1),
                80, guitar));

        Band gorillazz = new Band("Gorillaz", gorillaz);

        List<Band> bands = new ArrayList<>();
        bands.add(avengedSevenfold);
        bands.add(redHotChilliPeppers);
        bands.add(gorillazz);

        Festival festival = new Festival();
        festival.setName("SuperMegaExtra");
        festival.setStartTime(LocalDateTime.now());
        festival.setDurationPerBandInHrs(1);
        festival.setLineUp(bands);

        festival.simulate();
    }
}
