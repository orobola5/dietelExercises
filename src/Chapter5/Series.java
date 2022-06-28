package Chapter5;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kindly enter a range from 1-100");
        long range = input.nextInt();
        int product = 0;
        for (int i = 0; i <= range; i++) {
            product += i;
        }
        System.out.printf("%d %d\t",range,product);
    }
}
