package DataStructure.Queue;

import TutorialOop.Polymorphism.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayQueueTest {
    @Test void test_that_queue_is_empty(){
        ArrayQueue queue = new ArrayQueue(1);
        assertNotNull(queue);
    }
    @Test void test_that_queue_can_be_added(){
        ArrayQueue queue = new ArrayQueue(1);
        queue.addStudent(new Student("Ezekiel",16,"n02,mushin",206,new int[]{90,84,65}));
        queue.addStudent(new Student("Tolani",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tola",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tol",24,"n02,ifako",193,new int[]{90,84,65}));
        assertEquals(4,queue.getIndex());

    }
    @Test void test_that_queue_can_be_remove(){
        ArrayQueue queue = new ArrayQueue(1);
        queue.addStudent(new Student("Ezekiel",16,"n02,mushin",206,new int[]{90,84,65}));
        queue.addStudent(new Student("Tolani",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tola",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tol",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.removeStudent(new Student("Tola",24,"n02,ifako",193,new int[]{90,84,65}));
        assertEquals(3,queue.size());

    }
    @Test void test_to_peek(){
        ArrayQueue queue = new ArrayQueue(1);
        queue.addStudent(new Student("Ezekiel",16,"n02,mushin",206,new int[]{90,84,65}));
        queue.addStudent(new Student("Tolani",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tola",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.addStudent(new Student("Tol",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.removeStudent(new Student("Ezekiel",16,"n02,mushin",206,new int[]{90,84,65}));
        queue.removeStudent(new Student("Tolani",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.removeStudent(new Student("Tola",24,"n02,ifako",193,new int[]{90,84,65}));
        queue.peek();
        assertEquals(1,queue.size());


    }


}
