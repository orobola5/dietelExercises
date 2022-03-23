package tutorial;

import java.util.Scanner;

public class MultiplicationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("enter a number :");
       int number = scanner.nextInt();
          int i =0;
     while ( i <= 12 ) {
         int multiplication = number * i;
           System.out.println(number +" * " + i +" = " +multiplication);
            i++;   }

        System.out.println("enter another number :");
        int number2 = scanner.nextInt();
        int j =12;
        while ( j >= 0 ) {
            int multiplication = number2 * j;
            System.out.println(number +" * " + j +" = " +multiplication);
            j--;   }

    }
}
