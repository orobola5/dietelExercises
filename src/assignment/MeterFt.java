package assignment;

import java.util.Scanner;
public class MeterFt{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number");
	double number = input.nextDouble();
	 
	double meter = number * 0.305;

	System.out.printf(" %f%n",meter);

	}
}