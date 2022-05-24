package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        SalesCommissions calc = new SalesCommissions();
        calc.countRanges();
    }
    public void countRanges () {
        Scanner input = new Scanner(System.in);
        int[] total = new int[9];
        Arrays.fill(total, 0);

        System.out.print("Enter sales amount (negative to end): ");
            double dollars = input.nextDouble();
            while (dollars >= 0) {
                double salary = dollars * 0.09 + 200;

                int range = (int) (salary / 100);

                if (range > 10)
                    range = 10;

                ++total[range - 2];}

                System.out.print("Enter sales amount (negative to end): ");
                dollars = input.nextDouble();

            System.out.println("Range\t\tNumber");
            for (int range = 0; range < total.length - 1; range++)
                System.out.printf("$%d-$%d\t%d\n", (200 + 100 * range), (299 + 100 * range), total[range]);
            System.out.printf("$1000 and over\t%d\n", total[total.length - 1]);


        }
    }