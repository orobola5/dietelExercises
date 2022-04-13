package chapter6;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any values :");
        int x = input.nextInt();
        double y = Math.floor(x + 0.5);
        System.out.printf("the values of %d is %.2f%n",x,y);
    }

}
