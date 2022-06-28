package tutorial.NewTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Reversed {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        int[]elements ={1,2,3,4,5};
//        System.out.println(Arrays.toString(elements));
//        reverseArray(0);
//     repeatedAddition();
//     concept();
//     printNumber();
     letsTry();


    }
    public static void reverseArray(int elements) {
        int i = 5;
        while (i >elements) {
            System.out.println(i);
            i--;
        }

    }
    public static void repeatedAddition(){
        int number1= (int) (Math.random()*10);
        int number2= (int) (Math.random()*10);
        System.out.println("whats "+number1+"+"+number2+"?");
        int answer = input.nextInt();
         while(number1+number2!=answer){
             System.out.println("incorrect answer.Try again.\nwhats"+number1+"+"+number2+"?");
             answer = input.nextInt();
         }
        System.out.println("you got it");


    }

    public static void concept(){
        int sum = 0;
        for (int i = 0; i < 10;++i) {
            sum +=i;

        }
        System.out.println(sum);
    }
    public static  void printNumber(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println(i);

        }
    }
    public static void letsTry(){
        System.out.println("Multiplication Table");
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) {
            System.out.print("   "+i);
        }
        System.out.println("\n*******************************************");
        for (int i = 1; i <=10; i++) {
            System.out.println(i+"");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d*%d=%d",i,j,i*j);

            }
            System.out.println();


        }


    }

}
