package tutorial;

import java.util.Scanner;

public class WhileLearn<isMinor, n> {
    //public static void main(String[] args) {
//        int volume = 0;
//        while (volume <= 100) {
//            System.out.print(volume + " ");
//            volume++;
//        }
//        int i = 0;
//        while (i < 10) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//        int num = 0;
//        while (num < 10) {
//            if (num % 2 == 1) {
//                System.out.print(num + " ");
//            }
//            num++;
//        }
//    }



//        int age = 20;
//        boolean isMinor = age > 31;
//        if (isMinor) {
//            System.out.println("no");
//        } else {
//            System.out.println("yes");
//        }
//        boolean boo = (5 > 4.9 && 3.9 > 8.2);
//        if (boo == true) {
//            System.out.println("yes");
//        } else {
//            System.out.println("try");
//        }
        /*Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int i = input.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " is even ");
        } else {
            System.out.println(i + "  is odd");
        }

        int month = 4;
        String monthString;
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "febuary";
                break;
            case 3:
                monthString = "march";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "may";
                break;
            case 6:
                monthString = "june";
                break;
            case 7:
                monthString = "july";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "september";
                break;
            case 10:
                monthString = "october";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);*/
public static void main(String[] args) {
    int position = calculatedHighScorePosition(1500);
    displayHighScorePosition("love",position);

     position = calculatedHighScorePosition(900);
    displayHighScorePosition("gilbert",position);

     position = calculatedHighScorePosition(400);
    displayHighScorePosition("Bob",position);

    position = calculatedHighScorePosition(50);
    displayHighScorePosition("Grace",position);

}
public static void displayHighScorePosition(String playerName,int position){

System.out.println(playerName +"  " + "managed to get into position"+ "  "+position+ "  "+"on the high score table");

}
public  static int calculatedHighScorePosition(int playerScore){
    if(playerScore > 1000){
        return 1;
    }else if(playerScore >500 && playerScore <1000){
        return 2;
    }else if(playerScore >100 && playerScore <500) {
        return 3;
    }else
    {
        return 4;
    }

}



    }







