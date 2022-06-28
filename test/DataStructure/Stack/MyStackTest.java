package DataStructure.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack<Object> myStack;
    @BeforeEach public void setUp(){
         myStack= new MyStack<>();
    }
    @Test void testThatStackCanBeCreated(){
        assertNotNull(myStack);
    }

    @Test void testThatStackIsEmpty() {
        assertTrue(myStack.isEmpty());

    }

    @Test void testThatStackCanPush_toVerifyThatMyStackIsNotEmpty() {
        myStack.push(10);
        assertFalse(myStack.isEmpty());
    }

    @Test void testThatStackCanPushMoreThanOneTime() {
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
       assertEquals(4,myStack.size());
    }

    @Test void testThatStackCanPopAndCanBeEmpty() {
        myStack.push(10);
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test void testThatStackCanPop() {
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.pop();
        myStack.pop();
//       myStack.pop();
        assertEquals(1,myStack.size());
    }
    @Test
    public  void pushXY_popXY_elementIsYThenXTest(){
        myStack.push(45);
        myStack.push(34);
        myStack.push(30);
        myStack.push(32);
        int element = myStack.pop();
        assertEquals(4,element);
        element = myStack.pop();
        assertEquals(3,element);
        assertEquals(2,myStack.size());
    }

    @Test
    void testToPushPopAndPeek() {
        myStack.push(45);
        myStack.push(34);
        myStack.push(30);
        myStack.push(32);
        int element = myStack.peek();
        assertEquals(4,element);
        element = myStack.pop();
        assertEquals(4,element);
         element = myStack.peek();
        assertEquals(3,element);
        assertEquals(3,myStack.size());

    }
}