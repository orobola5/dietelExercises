package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        int sum = 0;
        int highestScore = 0;
        int lowestScore = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of student :");
        int n = input.nextInt();
        System.out.println("Enter the number of subject :");
        int m = input.nextInt();
        int[][] scores = new int[n][m];
        System.out.println(Arrays.deepToString(scores));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the scores of the subject");
                int subjectScores = input.nextInt();
                scores[i][j] = subjectScores;
                sum += scores[i][j];
            }
        }

        System.out.println(Arrays.deepToString(scores));
        double average = sum / scores.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (scores[i][j] > highestScore) {
                    highestScore = scores[i][j];
                } else {
                    lowestScore = scores[i][j];
                }
            }

        }


        System.out.println("The sum is " + sum);
        System.out.println("The Average is " + average);
        System.out.println("the highest scoring student is :" + highestScore);
        System.out.println("the lowest scoring student is :" + lowestScore);


    }
}









