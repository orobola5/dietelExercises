package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateTest {
    @Test
    void testThatHeartRateMonitorCanWork(){
        HeartRate heartRate = new HeartRate("love", "cozy",4,14,2002);
        assertNotNull(heartRate);
    }
    @Test
    void testToSetTheFirstName(){
        HeartRate heartRate = new HeartRate("love"," cozy",4,14,2002);
        heartRate.setFirstName("love");
        assertEquals("love",heartRate.getName());
    }
    @Test
    void testToSetTheLastName(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.setLastName("cozy");
        assertEquals("cozy",heartRate.getName());
    }
    @Test
    void testToSetTheMonth(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.monthOfBirth(4);
        assertEquals(4,heartRate.getDateOfBirth());
    }
    @Test
    void testToSetTheDay(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.dayOfBirth(14);
        assertEquals(14,heartRate.getDateOfBirth());
    }
    @Test
    void testToSetTheYear(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.yearOfBirth(2002);
        assertEquals(2002,heartRate.getDateOfBirth());}



    @Test
    void testToSetTheDateOfBirth(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.setDateOfBirth();
        assertEquals(14/4/2002,heartRate.getDateOfBirth());

    }
    @Test
    void testToGetTheAge(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.personAge();
        assertEquals(20,heartRate.personAge());
    }
    @Test
    void testToGetTheMaximumHeartRate(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.heartRate();
        assertEquals(200,heartRate.heartRate());
    }
    @Test
    void testToGetTheTargetHeartRate(){
        HeartRate heartRate = new HeartRate("love","cozy",4,14,2002);
        heartRate.targetHeartRate();
        assertEquals(100,heartRate.targetHeartRate());
    }
    @Test
    void testToPrintInformationOfPerson() {
        HeartRate heartRate = new HeartRate("love", "cozy", 4,14,2002);
       /* heartRate.setFirstName("love");
        assertEquals("love",heartRate.getName());
        heartRate.setFirstName("cozy");
        assertEquals("cozy",heartRate.getName());
        assertEquals(20,heartRate.personAge());
        assertEquals(200,heartRate.heartRate());
        assertEquals(100,heartRate.targetHeartRate());*/
        System.out.printf("%s%n%s%n%d%n%s%n%s%n", "love","cozy",20,"maximum heart rate : 200","target heart rate : 100");
    }

    





}
