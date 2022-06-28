package chapter6;

import java.util.Scanner;


public class RoundNumbers2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter any value:");
        int x = scanner.nextInt();
        roundToInteger(x);
        roundToTenths(x);
        roundToHundredths(x);
        roundToThousandths(x);
    }
    public static void roundToInteger(int x){
        double y = Math.floor(x + 0.5);
        System.out.printf("the values of %d is %.0f%n",x,y);
    }
    public  static void roundToTenths(int x){
        double y = Math.floor(x*10+0.5)/10;
        System.out.printf("the values of %d is %.2f%n",x,y);
    }
    public static void roundToHundredths(int x){
        double y = Math.floor(x*100+0.5)/100;
        System.out.printf("the values of %d is %.3f%n",x,y);

    }
    public static void roundToThousandths(int x){
        double y = Math.floor(x*1000+0.5)/1000;
        System.out.printf("the values of %d is %.4f%n",x,y);
    }



}
