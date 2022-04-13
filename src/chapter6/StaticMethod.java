package chapter6;

import java.util.Scanner;

public class StaticMethod {
    private String customer;
    private double hours;
    private double charges;
    public static void main(String[] args) {
        displayCharges();

    }
 public static void displayCharges() {
     Scanner input = new Scanner(System.in);
     double receipt = 0.0;
     double fee = 0.0;
     System.out.println("enter number of  customers");
     String customer = input.next();
     System.out.println("Enter the hours each customer parked in the garage(-1 to quit):");
     double hours = input.nextDouble();
     while (hours >= 0.0) {
         fee = calculatedCharge(hours);
         receipt += fee;
//System.out.println("the parking charges for our customer " +"who parked in the garage since yesterday is :" + charges);
         System.out.printf("current charge for customer: $%.2f, Total Receipts : $%.2f%n", fee, receipt);
         System.out.println("enter numbers of hours (-1 to quit):");
         hours = input.nextDouble();
     }
 }
    public static double calculatedCharge(double hours){
        double charges = 2.00;
        if (hours>3.00)charges =2.00+0.05*Math.ceil(hours-3.00);
        if(charges>10.00)charges=10.00;
        return charges;
    }




       /* double x;
        x = Math.abs(-7.5);
        System.out.println(x);
        x=Math.floor(5+2.5);
        System.out.println(x);
        x=Math.abs(9)+Math.ceil(2.2);
        System.out.println(x);
        x=Math.ceil(-5.2);
        System.out.println(x);
        x= Math.abs(-5)+Math.abs(4);
        System.out.println(x);
        x= Math.ceil(-6.4)-Math.floor(5.2);
        System.out.println(x);
        x=Math.ceil(-Math.abs(-3+Math.floor(-2.5)));
        System.out.println(x);*/




}
