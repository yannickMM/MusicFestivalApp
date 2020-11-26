package be.multimedi.softwaretesters.instrument;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class ElectricGuitar extends Instrument {
    public ElectricGuitar() {
        this("Les Paul", "Gibson");
    }

    public ElectricGuitar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void play() {
        System.out.println("Dlang dlang dlang");
    }
}
