package chapter4TddClass;

import java.util.Scanner;

public class LargestNumber {


    public static void main(String[] args) {
        getCounter(10);
    }

    static Scanner input = new Scanner(System.in);

    public static void getCounter(int number) {

        System.out.println("enter number of sales");
        for (int count = 1; count <= number; count++) {
            number = input.nextInt();
           count++;

            }

        }
        public  void max(){
            int largestNumber = 0;
        }
    }
