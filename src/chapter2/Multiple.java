package chapter2;

public class Multiple{
	public static void main(String[] args){
	int generalNumber = 7;
	int firstNumber = generalNumber*3;
	int secondNumber = firstNumber*2;

	if(firstNumber%secondNumber==0){
	System.out.println("firstNumber is a multiple of "+secondNumber);
	}

	if(firstNumber%secondNumber!=0){
	System.out.println("firstNumber is not a multiple of "+secondNumber);
	}

	}
}	