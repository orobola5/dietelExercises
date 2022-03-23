package assignment;

import java.util.Scanner;

public class TwelveDaysSong {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("enter  any day from 1 to 12");
       int days=input.nextInt();

           while (days>0 && days<=12){
            switch (days){
                case 1:
                    System.out.println("on the first day of christmas my true lord said to me ");
                    break;
                case 2:
                    System.out.println("on the second day of christmas my true lord said to me ");
                    break;
                case 3:
                    System.out.println("on the third day of christmas my true lord said to me ");
                    break;
                case 4:
                    System.out.println("on the fourth day of christmas my true lord said to me ");
                    break;
                case 5:
                    System.out.println("on the five day of christmas my true lord said to me ");
                    break;
                case 6:
                    System.out.println("on the sixth day of christmas my true lord said to me ");
                    break;
                case 7:
                    System.out.println("on the seventh day of christmas my true lord said to me ");
                    break;
                case 8:
                    System.out.println("on the eighth day of christmas my true lord said to me ");
                    break;
                case 9:
                    System.out.println("on the ninth day of christmas my true lord said to me ");
                    break;
                case 10:
                    System.out.println("on the tenth day of christmas my true lord said to me ");
                    break;
                case 11:
                    System.out.println("on the eleventh day of christmas my true lord said to me ");
                    break;
                case 12:
                    System.out.println("on the twelfth day of christmas my true lord said to me ");
                    break;
                default:
                    System.out.println("invalid number");

            }

            switch (days){

                case 12:
                    System.out.println("Twelve drummers druming");
                case 11:
                    System.out.println("Eleven pipers pipping ");
                case 10:
                    System.out.println("Ten lords a -leaping ");
                case 9:
                    System.out.println("Nine ladies dancing ");
                case 8:
                    System.out.println("Eight maids a -milking");
                case 7:
                    System.out.println("Seven swarms a -swimming ");
                case 6:
                    System.out.println("Six geese a -laying ");
                case 5:
                    System.out.println("Five golden ring ");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println(" Three french hens  ");
                case 2:
                    System.out.println("two turtle doves and ");
                case 1:
                    System.out.println("A partridge in a pear tree ");
                    break;
            }

               System.out.println("enter  any day from 1 to 12");
               days=input.nextInt();

            }



        }
    }
