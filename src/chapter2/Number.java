package chapter2;

import java.util.Scanner;

public class Number{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter my number1:");
	int number1 = input.nextInt();

	System.out.println("Enter my number2:");
	int number2 = input.nextInt();
	
	int squareNumber1 = 2*number1;
	
	int squareNumber2 = 2*number2;

	int difference = squareNumber1 - squareNumber2;
	System.out.print("The difference of square"+ difference );
	
	int sum = squareNumber1 + squareNumber2;
	System.out.println("The sum of square"+ sum );	

}

}
