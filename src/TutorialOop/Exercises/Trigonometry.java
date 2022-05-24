package TutorialOop.Exercises;

import java.util.Scanner;

public class Trigonometry {


    public double square_area(double squareSide){
        return Math.sqrt(squareSide);
    }
    public int rectangle_area(int base ,int height){
        return base * height/2;
    }
    public int triangle_area(int base ,int height){
        return base * height/2;
    }


}
class MainTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Trigonometry trigonometry = new Trigonometry();
        System.out.println("enter the side of a square : ");
        double sideSquare = input.nextDouble();
        double var = trigonometry.square_area(sideSquare);
        System.out.println(var);

        System.out.println("enter the base of rectangle");


    }

}

