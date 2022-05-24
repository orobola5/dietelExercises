package Chapter9;

import Chapter9.Progression.FibonacciProgression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciProgressionTest {

    @Test void nextValue() {
        FibonacciProgression fibonacci = new FibonacciProgression();
        fibonacci.previousValue=2000;
        fibonacci.currentProgression=4000;
        assertEquals(6000,fibonacci.nextValue());
    }
}