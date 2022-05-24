package Chapter9.Progression;

public class Progression {
   public long firstProgression;
   public long currentProgression;

    public Progression() {
        this.currentProgression=this.firstProgression=0;
    }

    public long firstValue () {
        currentProgression = firstProgression;
        return currentProgression;
    }
    public long nextValue () {
        currentProgression +=currentProgression;
        return currentProgression;

    }

    public void printProgression(int value) {
        System.out.println(firstValue());
    }
}
