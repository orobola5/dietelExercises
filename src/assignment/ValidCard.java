package assignment;

import java.util.Scanner;

public class ValidCard {
    static Scanner input = new Scanner(System.in);
    static int[] numbers = new int[16];

    public static void main(String[] args) {
        int[] numbers = new int[16];
        System.out.print("enter numbers" + " ");
        getInput();


    }

    private static int add(int x, int y) {
        return x + y;

    }

    public static void getInput() {
        for (int i = 0; i < 16; i++) {
            numbers[i] = input.nextInt();
            int input = numbers[i];
        }
        System.out.println(input);
    }

    public static int addSingle() {
        int evenNo = 0;
        for (int i = 0; i < 16; i += 2) {
            if (numbers[i] % 2 == 0) {
                evenNo += numbers[i] * 2;
                evenNo +=seperateNumber(evenNo);
            }

        }
        return evenNo;
    }

    public static int oddCardNumber() {
        int sumOddNumber = 0;
        for (int i = 0; i < 16; i += 2) {
            if (numbers[i] % 2 == 1) {
                sumOddNumber += numbers[i];
            }
            System.out.println(sumOddNumber);

        }
        return sumOddNumber;
    }

    public static void sumOfDoubleEvenPlace() {
        int evenNo = addSingle();
        int oddNo = oddCardNumber();
        int result = evenNo + oddNo;
        System.out.println(result);

    }

    public static void isValid(int[]numbers) {
        for (int i = 0; i < 16; i++) {
            if (numbers[i] % 10 == 0) {
                System.out.println("the card is valid");
            } else
                System.out.println("it is invalid");
        }
    }
    private static int seperateNumber(int numbers){
        if(numbers >9){
            int number1 = (numbers%10);
            int number2 = (numbers%100)/10;
            numbers = add(number1,number2);
        }
        return numbers;
    }
}




//    public static void doubleSecondDigit() {
//        int sum = 0;
//        int number = 0;
//        int[] numbers = new int[16];
//        System.out.println("enter the number");}
//

//    public static int seperateNumber(int number) {
//
//        return number;
//    }
