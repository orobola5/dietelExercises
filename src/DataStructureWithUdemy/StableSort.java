package DataStructureWithUdemy;

import java.util.Arrays;

public class StableSort {
    public static void main(String[] args) {
        int[]unstable={5,9,3,9,8,4};
        stableSort(unstable);

    }
public static void stableSort(int[] array){
    for (int i= 0; i < array.length;i++) {
        int lastUnsortedIndex= i;
        for (int j=i; j < array.length; j++) {
            if (array[j] < array[lastUnsortedIndex]) {
                lastUnsortedIndex = j;

            }
        }
            int temp=array[i];
            array[i]=array[lastUnsortedIndex];
            array[lastUnsortedIndex]=temp;

        System.out.println(Arrays.toString(array));
    }


}
}

