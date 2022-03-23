package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatBikeCanBeCreated() {
        Bike bike = new Bike("yamaha",true,0);
        assertNotNull(bike);
    }

    @Test
    public void testThatBikeCanHaveAName() {
        //given that
        Bike bike = new Bike("yamaha",false,0);
        //when
        bike.setName("yamaha");
        //assert
        assertEquals("yamaha", bike.getName());
    }

    @Test
    public void testThatBikeIsDefaultUponCreation() {
        //given that
        Bike bike = new Bike("yamaha",false,0);
        //when
        bike.setName("yamaha");
        assertEquals("yamaha", bike.getName());
        //assert
        bike.setIsOn();
        assertTrue(bike.getIsOn());
    }

    @Test
    public void testThatBikeCanTurnOn() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setIsOn();
        assertTrue(bike.getIsOn());
    }

    @Test
    public void testThatBikeCanTurnOff() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setIsOn();
        bike.setIsOn();
        assertFalse(bike.getIsOn());


    }

    @Test
    public void testThatBikeCanTurnOffAndOn() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setIsOn();
        bike.setIsOn();
        assertFalse(bike.getIsOn());
        bike.setIsOn();
        assertTrue(bike.getIsOn());
    }

    @Test
    public void testThatBikeCanAccelerate() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setAccelerate();
        bike.setAccelerate();
        assertEquals(2, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanDecelerate() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setAccelerate();
        bike.setAccelerate();
        bike.setDecelerate();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void testThatBikeCanAccelerateByGear1() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(15);
        bike.setAccelerate();
        assertEquals(16, bike.getSpeed());


    }

    @Test
    public void testThatBikeCanAccelerateByGear2() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(28);
        bike.setAccelerate();
        assertEquals(30, bike.getSpeed());


    }

    @Test
    public void testThatBikeCanAccelerateByGear3() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(35);
        bike.setAccelerate();
        assertEquals(38, bike.getSpeed());


    }

    @Test
    public void testThatBikeCanAccelerateByGear4() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(44);
        bike.setAccelerate();
        assertEquals(48, bike.getSpeed());


    }

    @Test
    public void testThatBikeCanDecelerateByGear1() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(15);
        bike.setDecelerate();
        assertEquals(14, bike.getSpeed());


    }

    @Test
    public void testThatBikeCanDecelerateByGear2() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(24);
        bike.setDecelerate();
        assertEquals(22, bike.getSpeed());

    }

    @Test
    public void testThatBikeCanDecelerateByGear3() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(35);
        bike.setDecelerate();
        assertEquals(32, bike.getSpeed());

    }

    @Test
    public void testThatBikeCanDecelerateByGear4() {
        Bike bike = new Bike("yamaha",false,0);
        bike.setSpeed(44);
        bike.setDecelerate();
        assertEquals(40, bike.getSpeed());

    }


}