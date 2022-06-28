package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushingZeroTest {
    @Test void pushZero(){
        int[]array={0,1,0,3,1,2};
        int n= array.length;
        PushingZero pushingZero = new PushingZero();
        pushingZero.Movezero(array,n);
        assertEquals("[1, 3, 1, 2, 0, 0]", pushingZero.printArray(array,n));
    }
    @Test void anotherPushZero(){
        int[]array={0,0,0,0,1,9,8,0,7,0,6};
        int n= array.length;
        PushingZero pushingZero = new PushingZero();
        pushingZero.Movezero(array,n);
        assertEquals("[1, 9, 8, 7, 6, 0, 0, 0, 0, 0, 0]", pushingZero.printArray(array,n));
    }


}