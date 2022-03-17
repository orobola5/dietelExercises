package assignment;

import java.util.Scanner;
public class Fapp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	double interest = 0.00417;
	System.out.println("enter savings :");
	int savings = input.nextInt();
	
	System.out.println("enter month1 :");
	double month1= input.nextDouble();
	
	System.out.println("enter month2 :");
	double month2 = input.nextDouble();
	
	System.out.println("enter month3 :");
	double month3 = input.nextDouble();
	
	
	double month4 = (savings + month3) * (1 + interest);

	
	double month5 = (savings + month4) * (1 + interest);

	double month6 = (savings + month5) * (1 + interest);

	System.out.println(" the account value after six month is :" + month6 );

	}

}