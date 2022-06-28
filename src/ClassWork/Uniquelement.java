package ClassWork;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Uniquelement {
    public static void main(String[] args) {
        int[]array ={2,2,3,3,4,8};
//        removeDuplicate(array);
        int n = array.length;
        removeDuplicateInHashMap(array,n);

    }
    public static void removeDuplicate(int[]array){
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
    }
    public  static void removeDuplicateInHashMap(int[]array,int n){
        HashMap<Integer,Boolean> set = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(set.get(array[i])==null){
                System.out.println(array[i]+" ");
                set.put(array[i],true );
            }

        }

    }
}

