package tutorial;

import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter number1 :");
	int number1 = input.nextInt();
	
	System.out.println("enter number2 :");
	int number2 = input.nextInt();
	
	System.out.println("enter number3 :");
	int number3 = input.nextInt();

	System.out.println("enter number4 :");
	int number4 = input.nextInt();

	System.out.println("enter number5 :");
	int number5 = input.nextInt();


		if (number1 == number5 && number2==number4)
		{
			System.out.println("this number is a palindrome ");
		}else{
			System.out.println("this number is not a palindrome");
		}

	}

}