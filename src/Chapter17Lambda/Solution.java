package Chapter17Lambda;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        SecureRandom secureRandom= new SecureRandom();
       IntStream stream = secureRandom.ints(1000,0,1001);
       List<Integer> list = stream.boxed().toList();
       long evenCount = list.stream().filter(x->x%2 ==0)
               .count();
        System.out.println("the even number is :"+evenCount);
       double evenAverage= (list.stream().filter(x->x%2 ==0)
               .reduce(0,Integer::sum))*0.1/evenCount;
        System.out.println("the evenAverage number is :"+evenAverage);

       long oddCount= list.stream().filter(x->x%2==1)
               .count();
        System.out.println("the odd number is "+oddCount);
        double oddAverage=(list.stream().filter(x->x%2 ==1)
                .reduce(0,Integer::sum))*0.1/oddCount;
//                .getAsDouble();
        System.out.println("the average of odd is "+oddAverage);



    }
}
