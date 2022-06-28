package DataStructure.Arraylist;

import DataStructure.Arraylist.ImplementList;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ImplementListTest {
    @Test void test_that_list_can_be_created(){
        ImplementList list = new ImplementList();
        assertNotNull(list);
    }
    @Test void test_that_list_isEmpty(){
        ImplementList list = new ImplementList();
        assertTrue(list.isEmpty());
    }

    @Test public void addTest() {
        ImplementList list = new ImplementList();
        list.add("Bu");
        list.add("Clo");
        list.add("S");
        list.add("face");
        assertEquals(4,list.size());

    }
    @Test void test_list_can_add() {
        ImplementList list = new ImplementList();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");

        assertEquals(3,list.size());
    }
    @Test void test_listAdd() {
        ImplementList list = new ImplementList();
        list.add("just breathe");
        assertEquals("just breathe",list.get(0));
        list.add("i will see tomorrow");
        assertEquals("i will see tomorrow",list.get(1));
    }


    @Test public void removeTest() {
        ImplementList list = new ImplementList();
        list.add("just breathe");
        list.add("i will see tomorrow");
        list.add("i come see tomorrow");
        list.add("make i see tomorrow");
        list.remove("i will see tomorrow");
        list.remove("i come see tomorrow");
        assertEquals(2,list.size());
    }
    @Test void testRemoveListUsingIndexAndItem() {
        ImplementList list = new ImplementList();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");
        list.add(3,"water-color");
       list.add(4,"math.set");

//       list.remove(4);
       list.remove(3);
       list.remove(2);
       list.remove(1);
       list.remove(0);

       assertEquals(1,list.size());

    }

    @Test void testToCreateNewEntry(){
        ImplementList list = new ImplementList();
        list.newEntry(0,"book");
        list.newEntry(1,"pencil");
        list.newEntry(2,"ruler");
        list.newEntry(3,"water-color");
        list.newEntry(4,"water");
        list.newEntry(5,"math.set");
        list.newEntry(6,"math");
        list.newEntry(7,"fan");
        list.newEntry(8,"love");
        list.newEntry(9,"light");
        list.newEntry(10,"jotter");
        list.newEntry(11,"otunba");
         assertEquals(12,list.size());
    }
    @Test void testToRemoveItems(){
        ImplementList list = new ImplementList();
        list.newEntry(0,"book");
        list.newEntry(1,"pencil");
        list.newEntry(2,"ruler");
        list.newEntry(3,"water-color");
        list.newEntry(4,"water");
        list.newEntry(5,"math.set");
        list.newEntry(6,"math");

        list.remove(5);
        list.remove(4);
        list.remove(3);
        list.remove(2);
        list.remove(1);
        list.remove(0);
        assertEquals(1,list.size());
    }
    @Test void testToGetIndexOfItems(){
        ImplementList list = new ImplementList();
        list.newEntry(0,"book");
        assertEquals("book",list.get(0));
        list.newEntry(1,"pencil");
        assertEquals("pencil",list.get(1));
        list.newEntry(2,"ruler");
        assertEquals("ruler",list.get(2));
        list.newEntry(3,"water-color");
        assertEquals("water-color",list.get(3));
        list.newEntry(4,"water");
        assertEquals("water",list.get(4));
        list.newEntry(5,"math.set");
        assertEquals("math.set",list.get(5));
        list.newEntry(6,"math");
        assertEquals("math",list.get(6));
        list.newEntry(7,"fan");
        assertEquals("fan",list.get(7));
        list.newEntry(8,"love");
        assertEquals("love",list.get(8));
    }
    @Test void testClearAll(){
        ImplementList list = new ImplementList();
        list.newEntry(0,"book");
        list.newEntry(1,"pencil");
        list.newEntry(2,"ruler");
        list.newEntry(3,"water-color");
        list.newEntry(4,"water");
        list.newEntry(5,"math.set");
        list.newEntry(6,"math");
        list.newEntry(7,"fan");
        list.newEntry(8,"love");
        list.newEntry(9,"light");
        list.newEntry(10,"jotter");
        list.newEntry(11,"otunba");
        list.clear();
        assertEquals(0,list.size());

    }
    @Test void testToSeeTheIndexContainInTheArray(){
        ImplementList list = new ImplementList();
        list.newEntry(0,"book");
//        list.newEntry(1,"pencil");
//        list.newEntry(2,"ruler");
//        list.newEntry(3,"water-color");
//        list.newEntry(4,"water");
//        list.newEntry(5,"math.set");
//        list.newEntry(6,"math");
        assertEquals(true,list.contains("book"));
    }


}
