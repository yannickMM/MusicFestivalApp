package be.multimedi.softwaretesters;

import be.multimedi.softwaretesters.person.Band;
import be.multimedi.softwaretesters.person.Musician;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Yannick Van Ham
 * created on Wednesday, 25/11/2020
 */
public class Festival {
    private String name;
    private List<Band> lineUp;
    private LocalDateTime startTime;
    private int durationPerBandInHrs;

    public Festival() {
    }

    public Festival(String name, List<Band> lineUp, LocalDateTime startTime, int durationPerBandInHrs) {
        this.name = name;
        this.lineUp = lineUp;
        this.startTime = startTime;
        this.durationPerBandInHrs = durationPerBandInHrs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Band> getLineUp() {
        return lineUp;
    }

    public void setLineUp(List<Band> lineUp) {
        this.lineUp = lineUp;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getDurationPerBandInHrs() {
        return durationPerBandInHrs;
    }

    public void setDurationPerBandInHrs(int durationPerBandInHrs) {
        this.durationPerBandInHrs = durationPerBandInHrs;
    }

    public double calcLineUpCost(){
        double totalCost = 0;
        for (Band band : lineUp) {
            double cost = calcBandCost(band);
            totalCost += cost;
        }
        return totalCost;
    }

    private double calcBandCost(Band band){
        double totalCost = 0;
        for (Musician musician: band.getMembers()) {
            double cost = musician.getHourlyWage() * getDurationPerBandInHrs();
            totalCost += cost;
        }
        return totalCost;
    }

    public void simulate(){
        System.out.println("Welcome to " + getName() + " " + getStartTime().getYear() + "!");
        System.out.println("**************************************************************");
        LocalDateTime currentTime = getStartTime();
        for (Band band : getLineUp()) {
            System.out.println("-\t-\t-\t-\t-");
            System.out.printf("%02d:%02d%n", currentTime.getHour(), currentTime.getMinute());
            System.out.printf("Now playing:\t%s%n", band.getName());
            band.perform();
            currentTime = currentTime.plusHours(getDurationPerBandInHrs());
        }
    }
}
