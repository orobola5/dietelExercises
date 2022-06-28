package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        int maximumNumber =0;
        int minimumNumber = 0;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("kindly enter the number");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > maximumNumber) {
                 maximumNumber=number;
            }else minimumNumber=number;

        }
        sum=maximumNumber+minimumNumber;

        System.out.println("the maximum value is :"+maximumNumber);
        System.out.println("the minimum number is :"+minimumNumber);
        System.out.printf("%d+%d=%d",maximumNumber,minimumNumber,sum);
    }
}