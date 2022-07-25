package BunmiDataStructureClassWork;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class LongFactorial {

    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            BigInteger x = BigInteger.valueOf(n);
            n = n - 1;
            while(n > 0){
                x = x.multiply(BigInteger.valueOf(n));
                n = n-1;
            }

            System.out.println(x);

        }
    }

