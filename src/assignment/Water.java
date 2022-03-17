package assignment;

import java.util.Scanner;
public class Water{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter amount in kilograms :");
	double amount = input.nextDouble();

	System.out.print("enter initialTemperature in kilograms :");
	double initialTemperature = input.nextDouble();
	
	System.out.print("enter finalTemperature in kilograms :");
	double finalTemperature = input.nextDouble();

	double energy = amount * (finalTemperature - initialTemperature) * 4184;

	System.out.println("the energy needed is :" + energy);

	}
}