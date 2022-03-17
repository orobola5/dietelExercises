package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ClockTest {
    @Test
    public void testThatClockAppCanBeCreated(){
        Clock myClock = new Clock("love-clock",12,30,50);
        assertNotNull(myClock);
    }
    @Test
    public void testThatClockAppCanHaveAName(){
        Clock myClock = new Clock("love-clock",12,30,50);
        myClock.setName("love-clock");
        assertEquals("love-clock",myClock.getName());
    }
    @Test
    public void testTheHourOfClockApp(){
        Clock myClock = new Clock("love-clock",12,30,50);
        myClock.setHour(12);
        assertEquals(12,myClock.getHour());
    }
    @Test
    public void testTheMinuteOfClockApp(){
        Clock myClock = new Clock("love-clock",12,30,50);
        myClock.setMinute(30);
        assertEquals(30,myClock.getMinute());
    }
    @Test
    public void testTheSecondsOfClockApp(){
        Clock myClock = new Clock("love-clock",12,30,50);
        myClock.setSeconds(50);
        assertEquals(50,myClock.getSeconds());
    }
    @Test
    public void testDisplayTime(){
        Clock myClock = new Clock("love-clock",12,30,50);
        myClock.setHour(12);
        myClock.setMinute(30);
        myClock.setSeconds(50);
        myClock.getDisplayTime();
        //System.out.println(myClock.getDisplayTime());
        assertEquals("12:30:50",myClock.getDisplayTime());
    }


}