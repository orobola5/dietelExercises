package Chapter9;

import Chapter9.Progression.ArithProgression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithProgressionTest {

    @Test void test_nextValue_progression() {
        ArithProgression arith = new ArithProgression(2);
        arith.currentProgression= 20;
        assertEquals(22,arith.nextValue());
    }
}