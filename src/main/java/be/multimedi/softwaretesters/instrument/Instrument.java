package be.multimedi.softwaretesters.instrument;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public abstract class Instrument implements Playable {
    private String brand;
    private String model;

    public Instrument(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
