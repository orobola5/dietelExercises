package BunmiDataStructureClassWork;

import java.util.Arrays;

public class PushingZero {

    public void Movezero(int[]array, int num) {
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] != 0)
                array[count++] = array[i];
        }
        for (int i = count; i < num; i++) {
            array[i] =0 ;

            }

        }



    public String printArray(int[]array, int num) {
        Movezero(array, num);
        for (int i = 0; i < num; i++) {
            System.out.println(array[i] + " ");
        }
        return Arrays.toString(array);
    }

//    public static void main(String[] args) {
//        int[]array={0,1,0,3,1,2};
//        int n= array.length;
//        Movezero(array,n);
//        System.out.println("modified array");
//        printArray(array,n);


}
