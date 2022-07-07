package Solidprinciple.solid;

import Solidprinciple.AreaCalculator;
import Solidprinciple.IAreaCalculator;

import java.util.List;

public class main {
    public static void main(String[] args) {
        IAreaCalculator calc = new AreaCalculator();
        Circle  circle = new Circle(10);
        Square square = new Square(10);

        Cube cube=new Cube();
        Rectangle rectangle= new Rectangle();
        ShapesPrinter printer=new ShapesPrinter(calc);
        Shapes noShape = new NoShape();
        List<Shapes>shapes= List.of(
                circle,
                square,
                cube,
                rectangle);
        int sum= calc.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }






}
