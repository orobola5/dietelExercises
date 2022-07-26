package Chapter17Lambda;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        IntStream originalStream = IntStream.rangeClosed(1, 20);
        int sum = originalStream
                .filter(x -> x % 2 == 0)
                .sum();


        int sum = IntStream.rangeClosed(1,20)
                .map(x->x*2)
                .sum();
        System.out.println(sum);


        int product = IntStream.rangeClosed(1, 5)
                .reduce((acc, el) -> acc * el)
                .getAsInt();
        System.out.println(product);

        IntBinaryOperator binaryOperator= Integer::sum;
        IntStream.rangeClosed(1,10)
                .reduce(binaryOperator)
                .getAsInt();


        int production = IntStream.rangeClosed(1, 25)
                .reduce(1, (acc, el) -> acc * el);
        System.out.println(production);



        int minimum= IntStream.rangeClosed(1,25).min().getAsInt();
        System.out.println(minimum);

        IntStream originalStream = IntStream.rangeClosed(1, 20);
        int sum = originalStream
                .filter(x -> x % 2 == 1)
                .map(x->x*x*x)
                .sum();
        System.out.println(sum);

        SecureRandom secureRandom= new SecureRandom();
        secureRandom.ints(10,1,7)
                .filter(x->x%2==0)
                .forEach(x-> System.out.println(x));

        String result=secureRandom.ints(20,1,15)
                .mapToObj(String::valueOf)
               .collect(Collectors.joining("-"));
        System.out.println(result);


        /*take in input
        * convert to lowercase
        * split
        * stream of(array)
        * sorted
        * distinct*/
        String input = new Scanner(System.in).nextLine();
        input=input.toLowerCase();
        String[]element=input.split("");
        List<String>stringList =Stream.of(element)
                .sorted()
                .distinct()
                .toList();
        System.out.println(stringList);


    }
}