package TutorialOop.Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {

    @Test void test_list_can_add() {
        Arraylist list = new Arraylist();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");
        assertEquals(3,list.size());
    }

    @Test void test_listAdd() {
        Arraylist list = new Arraylist();
        list.add("just breathe");
        assertEquals("just breathe",list.get(0));
        list.add("i will see tomorrow");
        assertEquals("i will see tomorrow",list.get(1));
    }

    @Test void test_remove_list() {
        Arraylist list = new Arraylist();
        list.add("just breathe");
        list.add("i will see tomorrow");
        list.add("i come see tomorrow");
        list.add("make i see tomorrow");
        list.remove("i will see tomorrow");
        assertEquals(3,list.size());
    }

    @Test void testRemoveListUsingIndexAndItem() {
        Arraylist list = new Arraylist();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");
        list.add(3,"water-color");
        list.add(4,"math.set");
        list.remove(1);
        assertEquals(4,list.size());

    }

    @Test void create_new_entry() {
        Arraylist list = new Arraylist();

        list.create_new_entry("math.set");

        assertEquals(10,list.size());



    }

}