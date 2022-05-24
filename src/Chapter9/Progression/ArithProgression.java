package Chapter9.Progression;

public class ArithProgression extends Progression {
    private final long increment;

    ArithProgression(){
        this(1);
    }

    public ArithProgression(long increment) {
        this.increment = increment;
    }

    @Override
    public long nextValue() {
        currentProgression += increment;
        return currentProgression;
    }
}
