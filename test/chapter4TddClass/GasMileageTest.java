package chapter4TddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GasMileageTest {
    @Test
    public void testThatGasMileageCanBeCreated() {
        GasMileage mine = new GasMileage(1000,50);
        assertNotNull(mine);
    }
    @Test
    void testTheMiles(){
        GasMileage mine = new GasMileage(1000,50);
        mine.setMiles(4000);
        assertEquals(4000,mine.getMiles());

    }
    @Test
    void testTheGallon(){
        GasMileage mine = new GasMileage(1000,50);
        mine.setGallon(100);
        assertEquals(100,mine.getGallon());

    }

    @Test
    public void testForTheMilesDrivenAndGallonUsedForEachTrip() {
        GasMileage mine = new GasMileage(1000,50);
        assertEquals(20, mine.calculateMilesPerGallon());

    }

    @Test
    public void testForTheMilesDrivenAndGallonUsedForAllTrips() {
        GasMileage mine = new GasMileage(1000,50);
        assertEquals(60, mine.combinedMilesPerGallon());

    }

   /* @Test
    public void testForCombinedMilesDrivenAndGallonUsedForAllTrips() {
        GasMileage mine = new GasMileage();
        mine.displayMilesPerGallon(1000, 50);
        mine.displayMilesPerGallon(2000, 50);
        assertEquals(60, mine.sum());

    }
    @Test
    public void testForAverageMilesDrivenAndGallonUsedForAllTrips() {
        GasMileage mine = new GasMileage();
        mine.displayMilesPerGallon(1000, 20);
        mine.displayMilesPerGallon(1000,20);
   ;
        assertEquals(1.0,mine.average());
    }*/
    }
