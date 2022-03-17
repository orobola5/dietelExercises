package chapter2;

import java.util.Scanner;
public class CylinderVolume{
	public static void main (String[]args){
  	Scanner input= new Scanner(System.in);
	System.out.println("Enter a number :");
	double radius = input.nextDouble();
	
	System.out.println("Enter another number :");
	int length = input.nextInt();

	
	double area = radius * radius * Math.PI;
	double volume = area * length;

	System.out.println("The area is: " +area);
	System.out.println("The volume is: " +volume);
	}
	
}




