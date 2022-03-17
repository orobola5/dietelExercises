package chapter2;

import java.util.Scanner;
	
  public class ComparingInteger {
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	
	int number1 = input.nextInt();
	
	if(number1 > 100){
	System.out.printf("%d > %d%n", number1, 100);
	}
	
	if(number1 == 100){
	System.out.printf("%d == %d%n", number1, 100);
	}
	
	if(number1 != 100){
	System.out.printf("%d != %d%n", number1, 100);
	}
	
	if(number1 < 100){
	System.out.printf("%d < %d%n", number1, 100);
	}
	
   }

}
	