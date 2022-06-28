package DataStructure.Linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test void testIfLinkedListIsEmpty(){
        LinkedList listMe = new LinkedList();
        assertTrue(listMe.isEmpty());
    }
    @Test
    void addFirst() {
        LinkedList listMe = new LinkedList();
        listMe.addFirst(30);
        assertEquals(30,listMe.size());
    }

    @Test
    void addLast() {
        LinkedList listMe = new LinkedList();
        listMe.addFirst(30);
        listMe.addLast(40);
        assertEquals(40,listMe.size());

    }

    @Test
    void removeFirst() {
        LinkedList listMe = new LinkedList();
        listMe.addFirst(30);
        listMe.addLast(40);
        listMe.removeFirst();
        assertEquals(40,listMe.size());

    }

    @Test
    void removeLast() {
        LinkedList listMe = new LinkedList();
         listMe.addLast(30);
        listMe.addLast(40);
        listMe.removeLast();
        assertEquals(30,listMe.size());

    }

    @Test
    void contain() {
        LinkedList listMe = new LinkedList();
        listMe.addFirst(30);
        listMe.addLast(40);
        listMe.indexOf(2);
        assertEquals(true,listMe.contain(40));
    }

    @Test
    void indexOf() {
        LinkedList listMe = new LinkedList();
        listMe.addFirst(30);
        listMe.addLast(40);
        listMe.addLast(70);
        listMe.addLast(80);
        assertEquals(3, listMe.indexOf(80));
    }
}