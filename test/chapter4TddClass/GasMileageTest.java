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


    }

    @Test
    public void testForTheMilesDrivenAndGallonUsedForEachTrip() {
        GasMileage mine = new GasMileage(1000, 50);
        assertEquals(1000, mine.getMiles());
        assertEquals(50, mine.getGallon());
        assertEquals(20.0, mine.calculateMilesPerGallon());

    }

//    @Test
//    public void testForTheMilesDrivenAndGallonUsedForAllTrips() {
//         mine.setMiles(500);
//         mine.setGallon(50);
//        assertEquals(10.0, mine.calculateMilesPerGallon());
//        assertEquals(10, mine.combinedMilesPerGallon());
//
//    }
}
//    @Test
//    public void testForCombinedMilesDrivenAndGallonUsedForAllTrips() {
//
//        mine.displayMilesPerGallon(1000, 50);
//        mine.displayMilesPerGallon(2000, 50);
//        assertEquals(60, mine.sum());
//
//    }
//    @Test
//    public void testForAverageMilesDrivenAndGallonUsedForAllTrips() {
//
//        mine.displayMilesPerGallon(1000, 20);
//        mine.displayMilesPerGallon(1000,20);
//   ;
//        assertEquals(1.0,mine.average());
//    }*/
//    }
