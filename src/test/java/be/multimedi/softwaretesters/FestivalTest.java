package be.multimedi.softwaretesters;

import be.multimedi.softwaretesters.person.Band;
import be.multimedi.softwaretesters.person.Musician;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yannick Van Ham
 * created on Thursday, 26/11/2020
 */
class FestivalTest {
    private Band testBand;
    private Festival testFestival;

    @BeforeEach
    void init(){
        testBand = new Band("Test Band", new ArrayList<>(
                Arrays.asList(
                        new Musician(),
                        new Musician(),
                        new Musician()
                )
        ));

        testFestival = new Festival();
        testFestival.setName("Test Festival");
        testFestival.setLineUp(new ArrayList<>(
                Arrays.asList(
                        testBand
                )
        ));
        testFestival.setDurationPerBandInHrs(1);
        testFestival.setStartTime(LocalDateTime.now());
    }

    @Test
    void calcBandCost() {
        // Arrange
        double expectedCost = 0;

        // Act
        double actualCost = testFestival.calcLineUpCost();

        // Assert
        Assertions.assertEquals(expectedCost, actualCost);
    }
}