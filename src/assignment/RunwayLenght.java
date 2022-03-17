package assignment;

import java.util.Scanner;
public class RunwayLenght{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter speedV in meter/second :");
	double speedV = input.nextDouble();
	
	System.out.println("enter accelerationA in meter/second squared :");
	double accelerationA = input.nextDouble();
	
	double squaredAccelerationA = 2 * accelerationA; 

	double length = speedV * speedV/squaredAccelerationA;


	System.out.print(length);

	}
}