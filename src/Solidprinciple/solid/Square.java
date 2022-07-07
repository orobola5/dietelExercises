package Solidprinciple.solid;

public class Square implements Shapes {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.PI* Math.pow(getLength(),2);
    }
}
