package tutorial;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      /*  SecureRandom generatedPasswords = new SecureRandom();
        char[]passwords = {'A','B','C','D','E','F','G','H','I','j','k','l','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9',
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
                'x','y','z'};
        for(int i = 0;i < 12;i++){
            int generate = generatedPasswords.nextInt(62);
            System.out.print(passwords[generate]);*/

        String[] array = new String[12];
        Random randomNumbers = new Random();
        String getPassword =" ";
          char[]passwords = {'A','B','C','D','E','F','G','H','I','j','k','l','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
        char [] passwords2 = {'0','1','2','3','4','5','6','7','8','9',};

        for(int i = 0; i < 4;i++){
            array[i] = String.valueOf(passwords[randomNumbers.nextInt(26)]);
        }
        for(int i = 4; i < 8;i++){
            array[i] = String.valueOf(passwords2[randomNumbers.nextInt(10)]);
        }
        for(int i = 8; i < 12;i++){
            array[i] = String.valueOf(passwords[randomNumbers.nextInt(26)]).toLowerCase();
        }
        for(int i = 0; i < 4;i++){
            getPassword= array[randomNumbers.nextInt(12)];
        }
        System.out.println(getPassword);
    }

}
        /*int[] myList=new int[5];
        myList[0]= 10;
        myList[1]=12;
        myList[2]=14;
        myList[3]=16;
        myList[4]=18;
//        System.out.println(myList[3] + myList[4]);
        myList[2]=myList[0] + myList[1];
//        System.out.println(myList[2])*/


        //initializing arrays with input values
        /*double[] myList = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter" +myList.length+"values:");
        for(int i = 0;i < myList.length;i++){
            myList[i]= input.nextDouble(); }*/

        //initializing arrays with 
        /*int[] ages = new int[5];
        int i = 0;
        while(i < 5){
            ages[i] = i*2;
            i++;
        }
        int j = 0;
        while(j < 5){
            System.out.println(ages[j]);
            j++;
        }*/

//        int [] arrays = new int[300];
//        for(int i = 0; i<300;i++){
//            arrays[i] = i+1;
//        }
//        for(int i = 0; i<300;i++){
//            System.out.print(arrays[i]+" ");
//        }


//        char [] uppercase = {'A','B','C','D','E','F','G','H','I','j','k','l','M',
//                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2'};

     /*   SecureRandom randomNumbers = new SecureRandom();
        char[] password = new char[12];
        int randomNumberGenerated;
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "12345678901234567890123456";

        for (int i = 0; i < 4; i++) {
            randomNumberGenerated = 1 + randomNumbers.nextInt(12);
            System.out.print(password[i] = number.charAt(randomNumberGenerated));
            System.out.print(password[i] = upperCase.charAt(randomNumberGenerated));
            System.out.print(password[i] = lowerCase.charAt(randomNumberGenerated));
        }*/



