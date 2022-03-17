package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void testThatTelevisionSetCanBeCreated(){
        Television myTelevision = new Television();
        assertNotNull(myTelevision);
    }

    @Test
    public void testThatTelevisionSetIsDefaultUponCreation(){
        Television myTelevision = new Television();
        myTelevision.setName("LG");
        assertEquals("LG",myTelevision.getName());
        myTelevision.setOn();
        assertTrue(myTelevision.getIsOn());
    }
    @Test
    public void testThatTelevisionSetIsTurnOn(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        assertTrue(myTelevision.getIsOn());
    }
    @Test
    public void testThatTelevisionSetCanHaveAName(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setName("LG");
        assertEquals("LG",myTelevision.getName());
    }

    @Test
    public void testThatTelevisionSetIsTurnOnOff(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setOn();
        myTelevision.setOn();
        myTelevision.setOn();
        assertFalse(myTelevision.getIsOn());
    }
    @Test
    public void testThatTelevisionSetIsColoured(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setColour("colour");
        assertEquals("colour",myTelevision.getColour());
    }

    @Test
    public void testThatTelevisionSetCanIncreaseVolume(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.volume(96);
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        assertEquals(100,myTelevision.getVolume());
    }
    @Test
    public void testThatTelevisionSetCanDecreaseVolume() {
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.increaseVolume();
        myTelevision.decreaseVolume();
        myTelevision.decreaseVolume();
        myTelevision.decreaseVolume();
        myTelevision.decreaseVolume();
        assertEquals(0, myTelevision.getVolume());
    }
    @Test
    public void testThatTelevisionSetChannel() {
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setChannel(22);
        assertEquals(22, myTelevision.getChannel());
    }
    @Test
    public void testThatTelevisionSetCanIncreaseChannel() {
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setChannel(48);
        myTelevision.increaseChannel();
        myTelevision.increaseChannel();
        myTelevision.increaseChannel();
        assertEquals(50, myTelevision.getChannel());
    }
    @Test
    public void testThatTelevisionSetCanDecreaseChannel() {
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setChannel(2);
        myTelevision.decreaseChannel();
        myTelevision.decreaseChannel();
        myTelevision.decreaseChannel();
        assertEquals(0, myTelevision.getChannel());
    }
    @Test
    public void testThatTelevisionCanChangeChannel(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.setChannel(10);
        myTelevision.changeChannel(24);
        assertEquals(24,myTelevision.getChannel());


    }
    @Test
    public void testThatTelevisionCanMuteAndUnmute(){
        Television myTelevision = new Television();
        myTelevision.setOn();
        myTelevision.volume(22);
        myTelevision.isMute();
        assertTrue(myTelevision.getMute());
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        assertFalse(myTelevision.getMute());
        assertEquals(24,myTelevision.getVolume());


    }
}
