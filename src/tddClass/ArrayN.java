package tddClass;

public class ArrayN {


    public int findMaximumFrom(int[] scores) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];

            }

        }
        return max;
    }

    public int findMinimumFrom(int[] scores) {

        int min = Integer.MAX_VALUE ;


        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }

        }
        return min;
    }

    public double findAverageFrom(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return  sum * 1.0/ scores.length;

    }
}