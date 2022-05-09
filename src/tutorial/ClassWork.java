package tutorial;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int [] arrays ={2,3,4};
        int sum = 0;
        for (int i = 0; i < arrays.length ; i++) {
            sum += arrays[i];
        }
        System.out.println("the sum of single dimensional array is:"+sum);

        int [][] array = {{2,5},
                         {6,4}};
        System.out.println(Arrays.deepToString(array));
        int Total = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Total += array[i][j];
            }
            }

            System.out.println("the sum  is :" + Total+" ");
        int average = sum/ array.length;
        System.out.println(average);

        System.out.println(" ");
    }

}
