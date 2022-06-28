package DataStructure.Queue;

import DataStructure.Queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue myQueue;
    @BeforeEach void setUp(){
        myQueue = new Queue(5);
    }
    @Test void test_that_queue_can_be_created(){
        assertNotNull(myQueue);
    }
    @Test void test_that_queue_isEmpty(){
        assertTrue(myQueue.isEmpty());
    }
    @Test void test_that_queue_can_add(){
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.view();
        assertEquals(4,myQueue.size());
    }
    @Test void test_that_queue_can_push_and_replace_item_from_the_back(){
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.insert(500);
        myQueue.insert(1000);
        myQueue.insert(2000);
        myQueue.insert(3000);
        myQueue.insert(4000);
      myQueue.view();
      assertEquals(5,myQueue.size());

    }
    @Test void test_that_queue_can_Dequeue(){
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.insert(500);
        myQueue.remove();
        myQueue.view();
        assertEquals(4,myQueue.size());
    }
    @Test void test_to_peek(){
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.insert(500);
       int peek = myQueue.peek();
       assertEquals(100,peek);
        assertEquals(4,myQueue.size());
    }
    @Test void test_if_queue_isFull(){
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.insert(500);
        assertTrue(myQueue.isFull());
    }



}