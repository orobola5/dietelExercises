package tutorial;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of student :");
        int n = input.nextInt();
        System.out.println("Enter the number of subject :");
        int m = input.nextInt();
        int[][] scores = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j =0; j < m; j++) {
                System.out.println("Enter the scores of the subject");
                int subjectScores = input.nextInt();
                scores[i][j] = subjectScores;
            }

        }
            for ( int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {


                    System.out.print(scores[i][j]+"  ");
                }
                System.out.println();
            }

        }


    }


