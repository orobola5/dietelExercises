package TutorialOop;

import TutorialOop.Interface.Arraylist;
import TutorialOop.Interface.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {

    @Test public void addTest() {
        List list = new Arraylist();
        list.add("Boxers for boyfriend");
        list.add("Clothes for boyfriend");
        list.add("Shoes for boyfriend");
        list.add("faceCap for boyfriend");
        assertEquals(4,list.size());

    }
    @Test public void addAndGetTest() {
        List list = new Arraylist();
        list.add("Boxers for boyfriend");
        assertEquals("Boxers for boyfriend",list.get(0));
        list.add("Clothes for boyfriend");
        assertEquals("Clothes for boyfriend",list.get(1));
        list.add("Shoes for boyfriend");
        assertEquals("Shoes for boyfriend",list.get(2));
    }

    @Test public void removeTest() {
        List list = new Arraylist();
        list.add("String in a guitar");
        list.add("Clothes for boyfriend");
        list.add("Shoes for boyfriend");
        list.add("faceCap for boyfriend");
        list.remove(1);
        assertEquals(3,list.size());
    }
}