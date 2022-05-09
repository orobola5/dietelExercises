package chapter4TddClass;

import java.util.Scanner;

public class TaxCalcMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            double earningTax = 0;
            System.out.println("enter earning person");
            double earning = input.nextDouble();
            double taxRate = 0;
            if (earning >= 30000) {
                System.out.println("enter taxrate per person");
                taxRate = input.nextDouble();
                double excessEarning = (taxRate * earning) / 100;
                earningTax += excessEarning;
                System.out.println("tax is " + earningTax);
            } else {
                earningTax = (taxRate * earning) / 100;
                System.out.println(earningTax);
//            }else{
//                System.out.println(earning);
//            }

            }

        }
    }
}