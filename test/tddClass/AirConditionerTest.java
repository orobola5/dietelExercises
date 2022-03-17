 package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {


    @Test
    void testThatAirConditionHasDefaultValuesUponCreation(){
        AirCondition airCondition = new AirCondition("lenovo",16,false);
        assertEquals(16,airCondition.getTemperature());
        assertEquals("lenovo",airCondition.getName());
        assertEquals(false,airCondition.getIsOn());
    }


    @Test
    public void testThatAirConditionCanBeCreated(){
        AirCondition airCondition = new AirCondition("Lenovo",16,false);
        assertNotNull(airCondition);
    }

    @Test
    public void testThatAirConditionHasAName(){
        AirCondition airCondition = new AirCondition("Lenovo",16,false);
        airCondition.setName("lenovo");
        assertEquals("lenovo",airCondition.getName());
    }
    @Test
    public void testThatAirConditionCanBeTurnOnAndOff(){
        AirCondition airCondition = new AirCondition("Lenovo",16,false);
        assertFalse(airCondition.getIsOn());
        airCondition.setIsOn();
        assertTrue(airCondition.getIsOn());
        airCondition.setIsOn();
        assertFalse(airCondition.getIsOn());
        airCondition.setIsOn();
    }


    @Test
    public void testThatAirConditionerCanChangeTemperature(){
        AirCondition aircondition = new AirCondition("Lenovo",16,false);
        int temperatureDigit = 17;
        aircondition.setTemperature(17);
        assertEquals(17,aircondition.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanHaveIncreaseAndDecreaseInTemperature(){
        AirCondition aircondition = new AirCondition("Lenovo",16,false);
        //The AC must be turned on before any activity of increasing temperature must happen
        aircondition.setIsOn();
        aircondition.setIsOn();
        aircondition.setIsOn();
        aircondition.setName("Thermocool");
        assertEquals(16,aircondition.getTemperature());
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        assertEquals(30,aircondition.getTemperature());
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        aircondition.decreaseTemperature();
        assertEquals(16,aircondition.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanNotDecreaseBeyond16(){
        AirCondition aircondition = new AirCondition("Lenovo",16,false);
        aircondition.setIsOn();
        aircondition.setIsOn();
        aircondition.setIsOn();
        aircondition.setName("Thermocool");
        int temperatureDigit = 16;
        aircondition.setTemperature(16);
        assertEquals(16,aircondition.getTemperature());
        aircondition.decreaseTemperature();
        assertEquals(16,aircondition.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanNotIncreaseBeyond30() {
        AirCondition aircondition = new AirCondition("Lenovo",16,false);
        aircondition.setName("lenovo");
        aircondition.setIsOn();
        int temperatureDigit = 28;
        aircondition.setTemperature(28);
        assertEquals(28, aircondition.getTemperature());
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        aircondition.increaseTemperature();
        assertEquals(30, aircondition.getTemperature());
    }
}
