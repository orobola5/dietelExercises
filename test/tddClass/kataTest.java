package tddClass;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class kataTest {
    @Test
    public void addTest() {
        kata calculator = new kata();
        int actual = calculator.add(4, 3);
        assertEquals(7, actual);
    }

    @Test
    public void subtractTest() {
        kata calculator = new kata();
        int actual = calculator.subtract(4, 3);
        assertEquals(1, actual);
    }

    @Test
    public void divideTest() {
        kata calculator = new kata();
        int actual = calculator.divide(12, 2);
        assertEquals(6, actual);
    }

    @Test
    public void multiplyTest() {
        kata calculator = new kata();
        int actual = calculator.multiply(10, 2);
        int actual2 = calculator.multiply(10, 2 / 10);
        assertEquals(2, actual);
    }

    @Test
    public void squareTest() {
        kata calculator = new kata();
        int actual = calculator.square(20);
        assertEquals(400, actual);
    }

    @Test
    public void testDrillerTestFor1to4copies() {
        kata testDriller = new kata();
        int number = testDriller.copiesNumber(2);
        assertEquals(4000, number);
    }

    @Test
    public void testDrillerTestFor5to9copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(7);
        assertEquals(12600, actual);
    }

    @Test
    public void testDrillerTestFor10to29copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(20);
        assertEquals(32000, actual);
    }

    @Test
    public void testDrillerTestFor30to49copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(48);
        assertEquals(72000, actual);
    }

    @Test
    public void testDrillerTestFor50to99copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(95);
        assertEquals(123500, actual);
    }

    @Test
    public void testDrillerTestFor100to199copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(128);
        assertEquals(153600, actual);
    }

    @Test
    public void testDrillerTestFor200to499copies() {
        kata testDriller = new kata();
        int actual = testDriller.copiesNumber(205);
        assertEquals(225500, actual);
    }

    @Test
    public void testDrillerTestFor500Above() {
        kata testDriller = new kata();
        int number = testDriller.copiesNumber(1000);
        assertEquals(1000000, number);
    }

    @Test
    public void test() {
        kata quotient = new kata();
        int number = quotient.number(12, 3);
        assertEquals(4, number);
    }


    @Test
    void whileLoop() {
        kata whileloop = new kata();
        int number = 1;
        //int number = 2;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number = number + 1;
        }
    }

    @Test
    void evenOrOdd() {
        kata evenOrOdd = new kata();
        boolean Number = evenOrOdd.evenOrOdd(3);
        assertFalse(Number);

        boolean Number2 = evenOrOdd.evenOrOdd(2);
        assertTrue(Number2);


    }

    @Test
    void biggestNumber() {
        kata biggestNumber = new kata();
        int number = biggestNumber.biggestNumber(2, 4, 6, 8, 10);
        assertEquals(10, number);
    }

    @Test
    void factorCount() {
        kata factorCount = new kata();
        int number = factorCount.factorCount(49);
        assertEquals(3, number);

    }

    @Test
    public void primeNumber() {
        kata primeNumber = new kata();
        boolean number = primeNumber.primeNumber(11);
        assertEquals(true, number);
    }
}










