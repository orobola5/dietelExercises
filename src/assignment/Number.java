package assignment;

import java.util.Scanner;
public class Number{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int minutes;
	int days;
	int year;
	System.out.println("enter the minutes :");
	minutes = input.nextInt();
	
	System.out.println("enter the days :");
	days = input.nextInt();
	
	System.out.println("enter the years :");
	int years = input.nextInt();

	 years = minutes * days;
	
	System.out.println( "the number of the year is :"  + years );

	
	}

}