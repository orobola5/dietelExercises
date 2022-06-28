package ClassWork;

import java.util.Scanner;

public class Position {

    static Scanner scanner = new Scanner(System.in);

    /*n is taking the size of the arr starting from 0 to n-1
    to find the position arr :  k have to jump from 0 meaning k is not starting from 0
    the jump of k is sent to the arr[i]index
    * */
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6};

        findPosition(arr, 4);
    }


    public static void findPosition(int[] array, int k) {

        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i]==k) {
                System.out.println("the position of array in index 2 is : " + i);
            }

        }
    }
}