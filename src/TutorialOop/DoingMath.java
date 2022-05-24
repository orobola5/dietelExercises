package TutorialOop;

import java.util.Scanner;

public class DoingMath {

    private void square(double x){
        System.out.println("the square of x :" +x+" is " +(x * x));
    }
    private void square_root(double y){
        if(y < 0) System.out.println("Error");
        else System.out.println("the square_root of y :" +y+ " is " +Math.sqrt(y));
    }

    public  void display_result(double x,double y) {
        square(x);
        square_root(y);
    }
}
class mainly{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoingMath square = new DoingMath();
        System.out.println("Enter number:");
        double number = input.nextDouble();
        square.display_result(number,number);

    }

}
