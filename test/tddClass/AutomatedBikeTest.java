package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatedBikeTest {
    @Test
    public void TestThatAutomatedBikeCanBeCreated() {
        AutomatedBike Bike = new AutomatedBike();
        assertNotNull(Bike);
    }

    @Test
    public void TestThatAutomatedBikeIsDefaultUponCreation() {
        AutomatedBike bike = new AutomatedBike();
        bike.setName("yamaha");
        assertEquals("yamaha", bike.getName());
        assertFalse(bike.getPower());
        bike.setIsPower();
        assertTrue(bike.getPower());
    }

    @Test
    public void TestThatAutomatedBikeHaveAName() {
        AutomatedBike Bike = new AutomatedBike();
        Bike.setName("yamaha");
        assertEquals("yamaha", Bike.getName());

    }

    @Test
    public void TestThatAutomatedBikeCanTurnOn() {
        AutomatedBike bike = new AutomatedBike();
        bike.setIsPower();
        assertTrue(bike.getPower());
    }

    @Test
    public void TestThatAutomatedBikeCanTurnOff() {
        AutomatedBike bike = new AutomatedBike();
        bike.setIsPower();
        bike.setIsPower();
        assertFalse(bike.getPower());
    }


    @Test
    public void TestThatAutomatedBikeCanTurnOffAndOn() {
        AutomatedBike bike = new AutomatedBike();
        bike.setIsPower();
        assertTrue(bike.getPower());
        bike.setIsPower();
        assertFalse(bike.getPower());

    }

    @Test
    public void TestThatAutomatedBikeCanAccelerate() {
        AutomatedBike bike = new AutomatedBike();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(20, bike.getSpeed());
    }

    @Test
    public void TestThatAutomatedBikeCanDecelerate() {
        AutomatedBike bike = new AutomatedBike();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.decelerate();
        assertEquals(3, bike.getSpeed());
    }

    @Test
    public void testThatAtGear1ItIncrementBy1() {
        AutomatedBike bike = new AutomatedBike();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void testThatAtGear2ItIncrementBy2() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.getSpeed());
    }

    @Test
    public void testThatAtGear3ItIncrementBy3() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(35);
        bike.accelerate();
        assertEquals(38, bike.getSpeed());
    }
    @Test
    public void testThatAtGear4ItIncrementBy4() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(44);
        bike.accelerate();
        assertEquals(48, bike.getSpeed());
    }
    @Test
    public void testThatAtGear1ItDecreaseBy1() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(1);
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testThatAtGear1ItDecreaseBy2() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(24);
        bike.decelerate();
        assertEquals(22, bike.getSpeed());
    }


    @Test
    public void testThatAtGear1ItDecreaseBy3() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(35);
        bike.decelerate();
        assertEquals(32, bike.getSpeed());
    }

    @Test
    public void testThatAtGear1ItDecreaseBy4() {
        AutomatedBike bike = new AutomatedBike();
        bike.setSpeed(44);
        bike.decelerate();
        assertEquals(40, bike.getSpeed());
    }


}