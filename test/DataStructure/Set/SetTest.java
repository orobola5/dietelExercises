package DataStructure.Set;

import DataStructure.Set.Set;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    @Test void testSetIsEmpty(){
        Set set = new Set();
        assertNotNull(set);
    }
    @Test void testSetCanAdd(){
        Set set = new Set();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        assertEquals(3,set.size());
    }
    @Test void testSetReplaceElement(){
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.set(4, 30);
      assertEquals("3",set.getIndex(2));

    }
  @Test void testToRemove(){
      Set set = new Set();
      set.add(10);
      set.add(12);
      set.add(13);
      set.add(40);
      set.remove(1);
      assertEquals(3,set.size());
  }




}