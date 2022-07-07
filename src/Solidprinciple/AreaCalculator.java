package Solidprinciple;

import Solidprinciple.solid.Circle;
import Solidprinciple.solid.Cube;
import Solidprinciple.solid.Shapes;
import Solidprinciple.solid.Square;

import java.awt.*;
import java.util.List;
public class AreaCalculator implements IAreaCalculator {
    //these class is known for calc d sum of an shapes area
    @Override
    public int sum(List<Shapes> shapes){
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shapes shape = shapes.get(i);
            sum+=shape.area();

        }
        return sum;
    }


}
