package chapter4TddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GasMileageTest {
    GasMileage mine;

    @Test
    void setUp() {

        mine = new GasMileage(1000, 50);
    }

    @Test
    public void testThatGasMileageCanBeCreated() {
        GasMileage mine = new GasMileage(1000, 50);
        assertNotNull(mine);
    }

    @Test
    void testTheMiles() {
        GasMileage mine = new GasMileage(1000, 50);
        mine.setMiles(4000);
        assertEquals(4000, mine.getMiles());

    }

    @Test
    void testTheGallon() {
        GasMileage mine = new GasMileage(1000, 50);
        mine.setGallon(100);
        assertEquals(100, mine.getGallon());
    }

    @Test public void testForCalcMilesDrivenAndGallonUsedForEachTrip() {
        GasMileage mine = new GasMileage(1000, 50);
        mine.setGallon(500);
        mine.setMiles(1000);
        mine.displayMilesPerGallon();
        assertEquals(0.5, mine.calculateMilesPerGallon());

    }

    @Test public void testForCombinedMilesDrivenAndGallonUsedForAllTrip() {
        GasMileage mine = new GasMileage(1000, 50);
        mine.tripArrayList(1000,50);
        mine.tripArrayList(1500,500);
        mine.tripArrayList(10000,500);
        mine.tripArrayList(600,300);
        mine.tripArrayList(1000,50);
        mine.combinedMilesPerGallon(14100.0,1400.0);
        assertEquals(10.07,mine.calculateMilesPerGallon());

    }
//    public void testForAverageMilesDrivenAndGallonUsedForAllTrips() {
//    }

}