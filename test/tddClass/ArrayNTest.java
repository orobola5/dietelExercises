package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayNTest {
    @Test
    public  void maximumNumberInArray(){
        ArrayN array = new ArrayN();
        int [] scores = {34,23,14,45,23};

        assertEquals(45, array.findMaximumFrom(scores));
    }
    @Test
    public void minimumNumberInArray(){
        ArrayN array = new ArrayN();
        int [] scores = {34,23,14,45,23};
        array.findMinimumFrom(scores);
        assertEquals(14, array.findMinimumFrom(scores));
    }
    @Test
    public void averageNumberInArray(){
        ArrayN array = new ArrayN();
        int [] scores = {34,23,14,45,23};
        assertEquals(27.8, array.findAverageFrom(scores));
    }


}
