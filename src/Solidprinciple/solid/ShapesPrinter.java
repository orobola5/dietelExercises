package Solidprinciple.solid;

import Solidprinciple.IAreaCalculator;

import java.util.List;

public class ShapesPrinter {
//these class have just one responsibility,which is printing
  private final IAreaCalculator areaCalculator ;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shapes>shapes) {
        return "{shapesSum:%s}".formatted(areaCalculator.sum(shapes));
    }
    public String csv(List<Shapes>shapes) {
        return "{shapesSum,%s}".formatted(areaCalculator.sum(shapes));
    }

}
