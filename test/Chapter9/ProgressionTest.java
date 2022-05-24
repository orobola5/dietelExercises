package Chapter9;

import Chapter9.Progression.Progression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressionTest {
    @Test void test_that_progression_can_be_created(){
        Progression pro = new Progression();
        assertNotNull(pro);
    }

    @Test void test_firstValue_progression() {
        Progression pro = new Progression();
        pro.firstProgression = 500;
        assertEquals(500,pro.firstValue());
    }

    @Test void nextValue() {
        Progression pro = new Progression();
        pro.currentProgression= 500;
        assertEquals(1000,pro.nextValue());
    }
    @Test void printProgression(){
        Progression pro = new Progression();
       pro.firstProgression = 500;
        pro.printProgression(1);

    }
}