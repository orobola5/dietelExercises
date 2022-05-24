package Chapter9;

import Chapter9.Progression.GeometricProgression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    @Test void nextValue() {
        GeometricProgression geo = new GeometricProgression();
        geo.currentProgression = 2000;
        assertEquals(4000,geo.nextValue());
    }
}