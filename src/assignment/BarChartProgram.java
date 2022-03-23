package assignment;

import java.util.Scanner;

public class BarChartProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number1 = input.nextInt();
        for(int i = 1; i <= number1;i++){
            if(number1 <=30){
                System.out.print("*");
            }
            else {
                System.out.println();
            }

        }
        System.out.println();


        System.out.println ("enter second number");
        int number2 = input.nextInt();
        for(int i = 1; i <= number2;i++){
            if(number2 <=30){
                System.out.print("*");
            }
            else {
                System.out.println();
            }

        }
        System.out.println();

        System.out.println("enter third number");
        int number3 = input.nextInt();
        for(int i = 1; i <= number3;i++){
            if(number3 <=30){
                System.out.print("*");
            }
            else {
                System.out.println();
            }

        }
        System.out.println();

        System.out.println("enter fourth number");
        int number4 = input.nextInt();
        for(int i = 1; i <= number4;i++){
            if(number4 <=30){
                System.out.print("*");
            }
            else {
                System.out.println();
            }

        }
        System.out.println();

        System.out.println("enter fifth number");
        int number5 = input.nextInt();
        for(int i = 1; i <= number5;i++) {
            if (number5 <= 30) {
                System.out.print("*");
            } else {
                System.out.println();
            }
        }
    }
}
