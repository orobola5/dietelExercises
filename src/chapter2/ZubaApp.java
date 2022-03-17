package chapter2;

import java.util.Scanner;
public class ZubaApp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int number1;
	int number2;
	int number3;

	System.out.print("enter first number :");
	number1 = input.nextInt();
	
	
	System.out.print("enter second number :");
	number2 = input.nextInt();
	
	
	System.out.print("enter third number :");
	number3 = input.nextInt();
	
	if(number1<number2 && number1<number3){ System.out.println(" the smallest number is :" + number1);
	}
	
	if(number2<number1 && number2<number3){ System.out.println(" the smallest number is :" + number2);
	}

	if(number3<number1 && number3<number2){ System.out.println(" the smallest number is :" + number3);
	}
	
	if(number1>number2 && number1>number3){ System.out.println(" the largest number is :" + number1);
	}
	
	if(number2>number1 && number2>number3){ System.out.println(" the largest number is :" + number2);
	}

	if(number3>number1 && number3>number2){ System.out.println(" the largest number is :" + number3);
	}


	}


}