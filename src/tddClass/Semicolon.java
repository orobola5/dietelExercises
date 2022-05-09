package tddClass;

import java.util.Arrays;

public class Semicolon {
    private final int[][] grades;

    public Semicolon(int[][] grades) {
        this.grades = grades;

    }


    public int getSum(int index) {
        int sum = 0;
        System.out.println(Arrays.deepToString(grades));
        for (int i = 0; i < grades[index].length; i++) {
            sum += grades[index][i];
            System.out.println(sum);
        }
        return sum;
    }

    public int getAverage(int index) {
        System.out.println(Arrays.deepToString(grades));

        return getSum(index) / grades[index].length;
    }

    public int getHighestGrade(int index) {
        int max = 0;
        int min = 0;
        System.out.println(Arrays.deepToString(grades));
        for (int i = 0; i < grades[index].length; i++) {
                if (grades[index][i] > max) {
                    max = grades[index][i];
                } else {
                    min = grades[index][i];
                }
        }
        System.out.println("the highest score of the subject 1 is :"+max);
        return max;
    }

    public int getLowestGrade(int index) {
        int min = 0;
        System.out.println(Arrays.deepToString(grades));
        for (int i = 0; i < grades[index].length; i++) {
            if (grades[index][i] > min) {
                min = grades[index][i];
            } else {
                min = grades[index][i];
            }
        }
        System.out.println("the lowest score of the subject 1 is :"+min);
        return min;
    }

}