package Chapter11;

public class Beans {
    private int noOfSpoon;
    private boolean withOmiEwa;

    public Beans(int noOfSpoon, boolean withOmiEwa) {
        this.noOfSpoon = noOfSpoon / 50;
        this.withOmiEwa = withOmiEwa;
    }

    @Override
    public String toString() {
        return String
                .format("%d spoons of beans %s",noOfSpoon,withOmiEwa?"with hot omiEwa.":".");

    }
}