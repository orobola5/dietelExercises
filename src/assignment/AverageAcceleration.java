package assignment;

import java.util.Scanner;
public class AverageAcceleration{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number in pounds :");
	double pounds = input.nextDouble();
	 
	double kilogram = pounds * 0.454;

	System.out.printf(" %f",kilogram);



	}



}
