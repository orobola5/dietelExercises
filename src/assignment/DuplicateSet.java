package assignment;

import java.util.Arrays;

public class DuplicateSet {
    public static void main(String[] args) {
       int [] setsOne ={12,13,10,6};
        int [] setsTwo ={13,10,16,15};
      sum(setsOne,setsTwo);
      sumDuplicate(setsOne,setsTwo);
      distinctElements(setsOne,setsTwo);


    }
    public static void  sum(int [] setsOne,int [] setsTwo) {
        int sum=0;
        for (int i = 0; i < setsOne.length; i++) {
            for (int j = 0; j < setsTwo.length; j++) {
              sum +=setsOne[i]+setsTwo[j];
            }
        }
        System.out.println(sum);


    }
    public static  void sumDuplicate(int[]setsOne,int[]setsTwo) {
        int sum = 0;
        for (int i = 0; i < setsOne.length; i++) {
            for (int j = 0; j < setsTwo.length; j++) {
                if (setsOne[i] == setsTwo[j]) {
                    sum += (setsOne[i] + setsOne[i]);
                }
            }
        }
        System.out.println(sum);
    }
    public static  void distinctElements(int[]setsOne,int[]setsTwo) {
        int sum = 0;
        for (int i = 0; i < setsOne.length; i++) {
            for (int j = 0; j < setsTwo.length; j++) {
                if (setsOne[i]!= setsTwo[j]) {
                    sum += (setsOne[i]+setsTwo[i]);
                }
            }
        }
        System.out.println(sum);

    }
}

