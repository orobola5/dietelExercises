package New.wok;

import java.util.Scanner;

public class Loop {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***Even numbers from 10 to 1***");
        System.out.println();
//       displayEvenNo();
//        displayStar1();
//        displayStar2();
//        displayStar3();
//        displayResult();
//        response();
//        any();
//        pattern1();
//        pattern2();
//       pattern3();
//       timeTable();
       DisplayStar();
    }
        public static void displayEvenNo() {
            System.out.println("enter a number");
            int number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
//            body of the loop is the main reason of the looping
                if (i % 2 == 0) {
                    System.out.println(i+"is even");
                }else System.out.println(i+"is odd");
            }
        }
     public static void displayStar1(){
         for (int i = 0; i < 5; i++) {
             System.out.println("*****");

         }
     }
    public static void displayStar2(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=7 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void displayStar3(){
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void displayResult(){
        System.out.println("what exam mark did you get");
        int mark= scanner.nextInt();
        for (int i = 0; i < mark; i++) {
            if (mark < 0 || mark > 100) {
                System.out.println("invalid mark: please kindly Re-enter!");
                mark = scanner.nextInt();
            }
        }
            if (mark>40) {
                System.out.println("congratulations ,you passed");
                
            }
            else System.out.println("you failed dear,its not the end of the world..read more");
        System.out.println("good luck with your other exams");

        }
    public static void response(){
        char response;
        do {
            System.out.println("another go(Y/N)?");
             response=scanner.next().charAt(0);
        }while (response =='y'||response=='Y');
    }

    public static void any() {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                continue;
            }
            System.out.println(i);

        }
    }
    public static void any2() {
        for (int i = 1; i <= 10; i++) {
            if (i >= 5) {
                break;
            }
            System.out.println(i);

        }
    }
    public static void square() {
        int num, square;
        System.out.println("enter a number");
        num = scanner.nextInt();
        System.out.println("enter the square of this number");
        square = scanner.nextInt();
        while (num == square) {
            System.out.println("wrong answer,try again");
            square = scanner.nextInt();
        }
        System.out.println("well done,right answer");
    }
    public static void ok(){
       for (int i = 5; i >= 2 ; i--) {
           switch (i) {
               case 1, 3 -> System.out.println("yes");
               case 2, 4, 5 -> System.out.println("No");
           }
        }
        System.out.println("ok");

    }
    public static void pattern1(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <6 ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <3 ; j++){
                    System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void pattern3(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
    public static void timeTable(){
        System.out.println("enter a number");
        int number = scanner.nextInt();
        while (number<2){
            System.out.println("invalid number:try again?");
            number= scanner.nextInt();
        }
        for (int i = 1; i <=12 ; i++) {
            System.out.printf("%d * %d = %d %n",i,number,i*number);

        }
    }
    public static void DisplayStar(){
        System.out.println("enter the size");
        int size = scanner.nextInt();
        while (!(size >=2&size<=20)) {
            System.out.println("another go,Try again...");
            size = scanner.nextInt();
        }
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void circle(){
        System.out.println("enter the user value");
        int value= scanner.nextInt();

    }


}

