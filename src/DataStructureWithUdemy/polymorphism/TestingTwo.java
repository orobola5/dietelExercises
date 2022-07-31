package DataStructureWithUdemy.polymorphism;

import java.util.Arrays;
import java.util.Scanner;

public class TestingTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of students");
        int noOfStudents = input.nextInt();

        System.out.println("enter number of subjects");
        int noOfSubjects = input.nextInt();

        int [] [] grades = new int[noOfStudents][noOfSubjects];
        int [] studentTotalScore = new int[noOfStudents];
        int[] subjectTotalScore = new int[noOfSubjects];

        for (int row = 0; row < noOfStudents; row++) {
            for (int column = 0; column < noOfSubjects ; column++) {
                System.out.println("Enter grade of student" +(row+1)+ " for subject"+(column+1));
                int score = input.nextInt();
                grades[row][column] = score;
            }
        }
int average =0;
        for (int i = 0; i < noOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < noOfSubjects; j++) {
                total += grades[i][j];
            }
            studentTotalScore[i] = total;
        }

        int sum=0;
        for (int i = 0; i < studentTotalScore.length; i++) {
            System.out.println("student"+(i+1)+" score is "+ studentTotalScore[i]);
            sum+=studentTotalScore[i];
        }
        System.out.println("the sum is of student total scores is "+ sum);
        average= sum/studentTotalScore.length;
        System.out.println("the average is :"+average);

//        System.out.println(Arrays.deepToString(grades));

//        for (int i = 0; i < noOfStudents; i++) {
//            for (int j = 0; j < noOfSubjects; j++) {
//
//                sum += grades[i][j];
//            }
//            subjectTotalScore[i] = sum;
//        }
//
//        for (int i = 0; i < subjectTotalScore.length; i++) {
//            System.out.println("subject"+(i+1)+" score is "+ subjectTotalScore[i]);
//        }

    }
}
