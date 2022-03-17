package chapter2;

import java.util.Scanner;
public class Multiplication{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	

	System.out.println("enter first number");
	int firstNumber  =  input.nextInt();

	System.out.println("enter second number");
	int secondNumber  =  input.nextInt();
	

	if(firstNumber%secondNumber!=0){
	System.out.println("firstNumber is a multiple of "+secondNumber);
	}

	if(firstNumber%secondNumber!=0){
	System.out.println("firstNumber is not a multiple of "+secondNumber);
	}
	
	}

}



