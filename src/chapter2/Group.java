package chapter2;

import java.util.Scanner;
	public class Group{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("enter first number");
	int number1  =  input.nextInt();
	
	System.out.println("enter second number");
	int number2  =  input.nextInt();
	
	System.out.println("enter third number");
	int number3 =  input.nextInt();
	
	System.out.println("enter fourth number");
	int number4 =  input.nextInt();
	
	System.out.println("enter fifth number");
	int number5 =  input.nextInt();

	if(number1<number2 && number1<number3 && number1<number4 && number1<number5){
	System.out.println("the smallest is :" + number1);
	}
	if(number2<number1 && number2<number3 && number2<number4 && number2<number5){
	System.out.println("the smallest is :" + number2);
	}
	if(number3<number1 && number3<number2 && number3<number4 && number3<number5){
	System.out.println("the smallest is :" + number3);
	}
	if(number4<number1 && number4<number2 && number4<number3 && number4<number5){
	System.out.println("the smallest is :" + number4);
	}
	if(number5<number1 && number5<number2 && number5<number3 && number5<number4){
	System.out.println("the smallest is :" + number5);
	}

	
	if(number1>number2 && number1>number3 && number1>number4 && number1>number5){
	System.out.println("the largest is :" + number1);
	}
	if(number2>number1 && number2>number3 && number2>number4 && number2>number5){
	System.out.println("the largest is :" + number2);
	}
	if(number3>number1 && number3>number2 && number3>number4 && number3>number5){
	System.out.println("the largest is :" + number3);
	}
	if(number4>number1 && number4>number2 && number4>number3 && number4>number5){
	System.out.println("the largest is :" + number4);
	}
	if(number5>number1 && number5>number2 && number5>number3 && number5>number4){
	System.out.println("the largest is :" + number5);
	}


	}

}