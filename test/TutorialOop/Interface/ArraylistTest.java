package TutorialOop.Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {

    @Test void test_list_can_add() {
        Arraylist<Object> list = new Arraylist<>();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");
        list.add(3,"ruler");
        list.add(4,"ruler");

        assertEquals(5,list.size());
    }

    @Test void test_listAdd() {
        Arraylist<Object> list = new Arraylist<>();
        list.add("just breathe");
        assertEquals("just breathe",list.get(0));
        list.add("i will see tomorrow");
        assertEquals("i will see tomorrow",list.get(1));
    }

    @Test void test_remove_list() {
        Arraylist<Object> list = new Arraylist<>();
        list.add("just breathe");
        list.add("i will see tomorrow");
        list.add("i come see tomorrow");
        list.add("make i see tomorrow");
        list.remove(0);
        assertEquals(3,list.size());
    }

    @Test void testRemoveListUsingIndexAndItem() {
        Arraylist<Object> list = new Arraylist<>();
        list.add(0,"book");
        list.add(1,"pencil");
        list.add(2,"ruler");
        list.add(3,"water-color");
        list.remove(1);
        assertEquals(3,list.size());

    }

    @Test void testThatListCanInsert() {
        Arraylist<Object> list = new Arraylist<Object>();
        list.insert("pencil");
        list.insert("color");
        list.insert("Bag");
       list.insert("spoon");
        list.insert("set");
        list.insert("drum");
       list.insert("math.set");
       list.insert("math.set");
      list.remove(0);
    list.remove(1);
       list.remove(2);
       assertEquals(5,list.size());



    }

}