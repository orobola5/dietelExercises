package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int initialAnswer;
        int userAnswer;
        int correctValue = 0;
        int wrongValue = 0;

        int number = 1;
        while ( number <= 11) {
            int firstRandomValue = 1 +randomNumbers.nextInt(10);
            int secondRandomValue =1 + randomNumbers.nextInt(10);
            int operatorsNumber =  1 + randomNumbers.nextInt(4);
            number++;

            switch (operatorsNumber) {
                case 0:
                    initialAnswer = firstRandomValue + secondRandomValue;
                     System.out.printf("%d + %d = ", firstRandomValue, secondRandomValue);
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctValue++;
                    } else {
                        System.out.println("wrong");
                        wrongValue++;
                    }
                    break;
                case 1:
                    initialAnswer = firstRandomValue - secondRandomValue;
                    if (firstRandomValue > secondRandomValue) {
                        System.out.printf("%d - %d = ", firstRandomValue, secondRandomValue);
                        userAnswer = input.nextInt();
                    } else {
                        initialAnswer = secondRandomValue - firstRandomValue;
                        System.out.printf("%d - %d =", secondRandomValue, firstRandomValue);
                        userAnswer = input.nextInt();
                    }
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctValue++;
                    } else {
                        System.out.println("wrong");
                        wrongValue++;
                    }
                    break;


                case 2:

                    initialAnswer = firstRandomValue * secondRandomValue;
                    System.out.printf("%d * %d =", firstRandomValue, secondRandomValue);
                    userAnswer = input.nextInt();
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctValue++;
                    } else {
                        System.out.println("wrong");
                        wrongValue++;
                    }
                    break;

                case 3:

                    initialAnswer = firstRandomValue / secondRandomValue;
                    if (firstRandomValue > secondRandomValue) {
                        System.out.printf("%d / %d =", firstRandomValue, secondRandomValue);
                        userAnswer = input.nextInt();
                    } else {
                         initialAnswer = secondRandomValue / firstRandomValue;
                        System.out.printf("%d / %d =", secondRandomValue, firstRandomValue);
                        userAnswer = input.nextInt();
                    }
                    if (initialAnswer == userAnswer) {
                        System.out.println("correct");
                        correctValue++;
                    } else {
                        System.out.println("wrong");
                        wrongValue++;
                    }

                    break;
            }

                }
            System.out.println("correctValue : " + correctValue);
            System.out.println("wrongValue : " + wrongValue);
        int adjustedValue = correctValue -wrongValue;
        System.out.println("The Adjusted value is " + adjustedValue);



        }
}