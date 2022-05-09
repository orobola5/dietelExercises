package tutorial;


import java.util.Scanner;

public class Arrange{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        System.out.println("enter all statement");
        String s = scan.next();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the number : ");
//        int N = scanner.nextInt();
//        if(N%2==1){System.out.println("Weird");}
//        else if(N>=2 && N<=5)
//        {System.out.println("Not Weird");
//        }
//        else if(N>=6 && N<=20)
//        {System.out.println(" Weird");
//        } else {
//            System.out.println("Not Weird");
//        }
//    }



