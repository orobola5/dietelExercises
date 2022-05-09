package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }
    @Test
    public  void testThatStackCanBeCreated(){
        assertNotNull(stack);
    }
    @Test
    public  void testThatStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public  void pushOneElement_StackIsNotEmptyTest(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public  void pushX_popX_StackShouldBeEmptyTest(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public  void pushXY_popY_StackShouldNotBeEmptyTest(){
        stack.push(13);
        stack.push(45);
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    public  void pushX_popX_elementShouldBeXTest(){
        stack.push(45);
        int element = stack.pop();
        assertEquals(45,element);
    }
    @Test
    public  void pushXY_popXY_elementIsYThenXTest(){
        stack.push(45);
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
        element = stack.pop();
        assertEquals(45,element);
    }
    @Test
    public  void pushXY_peekReturnsYTest(){
        stack.push(54);
        stack.push(43);
        int element = stack.peek();
        assertEquals(43,element);
        element = stack.pop();
        assertEquals(43,element);
        element = stack.peek();
        assertEquals(54,element);
    }


}
