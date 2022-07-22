package DataStructure.SinglyLinkedListTest;

import DataStructure.SinglyLinkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {

        SinglyLinkedList<Integer> singlyLinkedList;

        @Test
        void testThatCanAddNodeToList(){
            singlyLinkedList = new SinglyLinkedList<>();
            singlyLinkedList.insert(2);
            singlyLinkedList.insert(5);
            singlyLinkedList.insert(12);
            singlyLinkedList.insert(22);

            String expected = "2 --> 5 --> 12 --> 22";
            assertEquals(expected, singlyLinkedList.toString());

        }
}
