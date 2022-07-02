package DataStructureWithUdemy;

import java.util.Arrays;

public class selectionSortAlgorithm {
    public static void main(String[] args) {
        int[]array={20,35,-15,1,7,55,-22};
        selectUnsorted(array);

    }
    public static void selectUnsorted(int[]values){
        for (int lastUnsortedIndex =  values.length-1;
             lastUnsortedIndex>0; lastUnsortedIndex--)
        {
            int largest=0;
            for (int i = 1; i <=lastUnsortedIndex ; i++) {
                if (values[i] > values[largest]) {
                    largest = i;
                }
            }
                int temp = values[lastUnsortedIndex];
                values[lastUnsortedIndex]=values[largest];
                values[largest]=temp;



            }
        System.out.println(Arrays.toString(values));

        }

    }

