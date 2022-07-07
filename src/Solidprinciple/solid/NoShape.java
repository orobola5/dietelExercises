package Solidprinciple.solid;

public class NoShape implements Shapes {
    @Override
    public double area() {
        throw new IllegalArgumentException
                ("cannot calculate area");

    }
}
