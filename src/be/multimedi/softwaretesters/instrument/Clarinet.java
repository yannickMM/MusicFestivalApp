package be.multimedi.softwaretesters.instrument;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Clarinet extends Instrument {
    private Key key;

    public Clarinet() {
        this("Mendini", "MCT-E+SD+PB", Key.B_FLAT);
    }

    public Clarinet(String brand, String model, Key key) {
        super(brand, model);
        this.key = key;
    }

    @Override
    public void play() {
        System.out.println("Doodle doodle doodle");
    }
}
