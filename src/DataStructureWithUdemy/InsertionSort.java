package DataStructureWithUdemy;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]unsortedValue={20,35,-15,7,55,1,-22};
        sortedPartition(unsortedValue);
        shellSort(unsortedValue);

    }
    public static void sortedPartition(int[]value){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < value.length; firstUnsortedIndex++) {
            int newElement = value[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && value[i - 1] > newElement; i--) {
                value[i] = value[i-1];
            }
            value[i]=newElement;
        }
        System.out.println(Arrays.toString(value));
    }

    public static void shellSort(int[]intArray){
        for (int gap = intArray.length/2; gap > 0; gap/=2) {

            for (int i = gap; i < intArray.length ; i++) {
                int newElement =intArray[i];
                int j =i;

                while (j >= gap && intArray[j-gap]>newElement){
                    intArray[j]=intArray[j-gap];
                    j-=gap;
                }
                intArray[j]=newElement;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}

