package assignment;

import java.util.Scanner;
public class Velocity{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter initial velocity: ");
	double initialVelocity = input.nextDouble();
	
	System.out.print("enter final velocity : ");
	double finalVelocity = input.nextDouble();

	System.out.print("enter time : ");
	double time = input.nextDouble();
	
	double velocity = (finalVelocity - initialVelocity ) / time;


	System.out.printf(" the final velocity is " +  velocity);

	}
}
