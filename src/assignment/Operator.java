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


        for (int number = 0; number <= 10; number++) {
            int firstRandomValue = randomNumbers.nextInt(70);
            int secondRandomValue = randomNumbers.nextInt(70);
            int operatorsNumber = randomNumbers.nextInt(4);
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
                    if (firstRandomValue > secondRandomValue) {
                        initialAnswer = firstRandomValue / secondRandomValue;
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

