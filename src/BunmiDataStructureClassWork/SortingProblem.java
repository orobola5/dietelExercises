package BunmiDataStructureClassWork;

import java.util.Arrays;

public class SortingProblem {
    public static void main(String[] args) {
        int[]array={10,2,1,35,5,6,12};
        selectionSort(array);
        selectionSortingTheBiggest(array);
        bubbleSet(array);
    }
    public  static void selectionSort(int[]input){
        for (int i = 0; i < input.length-1; i++) {
            int indexOfSmallest = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
        System.out.println(Arrays.toString(input));
    }
    public  static void selectionSortingTheBiggest(int[]ints){
        for (int i = 0; i<ints.length-1; i++) {
            int indexOfBiggest = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] > ints[indexOfBiggest]) {
                    indexOfBiggest = j;
                }
            }
            int temp = ints[i];
            ints[i] = ints[indexOfBiggest];
            ints[indexOfBiggest] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
    public static void bubbleSet(int[]input){
        for (int i = 0; i <input.length-1 ; i++) {
            for (int j = 0; j +1< input.length-i; j++) {
                if (input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(input));
    }
}
