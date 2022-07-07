package BunmiDataStructureClassWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class longestSubstring {
    public static void main(String[] args) {
        String[] array = {"abcadeccdccd"};
        int n = array.length;
//        removeDuplicate(array);

    }


    public static void removeDuplicate(String[] array) {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(array));
        System.out.println(set);
    }

    public  void removeDuplicateInHashMap(String s) {
        int n=s.length();
        int res=0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(checkRepetition(s,i,j)){
                    res = Math.max(res,j-i+1);
                }

            }
        }
    }

    private boolean checkRepetition(String s,int start,int end){
        int[] chars = new int[15];
        for (int i = start; i <=end ; i++) {
            char c=s.charAt(i);
            chars[c]++;
            if (chars[c]>1){return false;}
        }
        return  true;
    }



}


