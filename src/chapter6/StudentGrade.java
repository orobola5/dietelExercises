package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int noOfStudent = 3;
        int noOfSubject = 4;
        int [][] array = new int[noOfStudent][noOfSubject];
        System.out.println(Arrays.deepToString(array));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("enter the score for each subject");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

            }

        }


