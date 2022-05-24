package Chapter9.Progression;

public class GeometricProgression extends Progression {
    private long base;

    public GeometricProgression(){
        this(2);

    }
    GeometricProgression(long base) {
        this.base = base;
        firstProgression = 1;
        currentProgression=firstProgression;
    }

    @Override
    public long nextValue() {
        currentProgression *=base;
        return currentProgression;
    }
}
