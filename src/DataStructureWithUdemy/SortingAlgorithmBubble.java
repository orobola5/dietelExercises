package DataStructureWithUdemy;

import java.util.Arrays;

public class SortingAlgorithmBubble {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(array));
        }

    }
}
