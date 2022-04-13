package tutorial;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class StaticCall {
//    public static void main(String[] args) {
//        Chapter6 six = new Chapter6();
//        Chapter6.letsPlay("go");
//        six.setAge(2);
//        Account account = new Account();
//        account.setName("zne");
//        System.out.println(account.getName());
//        LetsGo goWhere;
//
//        goWhere = LetsGo.MONDAY;
//        System.out.println(goWhere);
//        System.out.println(  LetsGo.valueOf(String.valueOf(goWhere)));
//    }


    public static int sum(int i1, int j) {
        int sum = 0;
        for (int i = i1; i <= j; i++)
            sum = sum + i;
        return sum;
    }

    public static int max(int num1, int num2, int num3, int num4, int num5) {
//        num1 = 34;
//        num2 = 23;
//        num3 = 14;
//        num4 = 45;
//        num5= 23;
        int result =  Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
    //return Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
return result;
    }
    public static double min(double i,double j){
        while (i<j){
            j--;
        }
//        return Math.min(i,j);
         return j;

    }

    public static void main(String[] args) {

        System.out.println(min(6,2));
        System.out.println(max(34, 23, 14, 45, 23));
        System.out.println("sum from 1 to 10 is  :" + sum(1, 10));
        System.out.println("sum from 20 to 37 is :" + sum(20, 37));
        System.out.println("sum from 35 to 49 is :" + sum(35, 49));

    }

}
