package Chapter9.Progression;

public class FibonacciProgression extends Progression {
    public long previousValue;
    
    public FibonacciProgression(){
        this(0,1);
    }

    public FibonacciProgression(long value1, long value2) {
        firstProgression=value1;
        previousValue=value2-value1;
    }

    @Override
    public long nextValue() {
        long temp =previousValue;
        previousValue = currentProgression;
        currentProgression+=temp;
        return currentProgression;
    }
}
