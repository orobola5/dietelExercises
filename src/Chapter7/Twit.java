package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Twit {
     static Scanner scanner = new Scanner(System.in);
     static  int[] totalViewsPerPost;
    public static void main(String[] args) {
        System.out.println("enter the no of post :");
        int noOfPost = scanner.nextInt();
        System.out.println("enter the  no of views :");
        int noOfView = scanner.nextInt();
        int[][] tweet = new int[noOfPost][noOfView];
        myTwitterAccount(tweet,noOfPost,noOfView);
        totalViews(tweet,noOfPost,noOfView);
        sumTotal();
        average();
        findingMax();
//        findingMin();

    }
    public static void myTwitterAccount(int [][] tweet,int noOfPost,int noOfView) {

        for (int row = 0; row < noOfPost; row++) {
            for (int column = 0; column < noOfView; column++) {
                System.out.println("enter the number of likes of post  " +(row +1)+ "for views  " + (column+1) );
                int likesOfEachPost = scanner.nextInt();

                tweet[row][column] = likesOfEachPost;
            }
        }
        System.out.println(Arrays.deepToString(tweet));
    }

    public static void totalViews(int [][] tweet,int noOfPost,int noOfView) {
        totalViewsPerPost = new int[noOfPost];

        for (int row = 0; row < noOfPost; row++) {
                int total = 0;
                for (int column = 0; column < noOfView; column++) {
                    total += tweet[row][column];
                }
                totalViewsPerPost[row] = total;
        }
System.out.println("the total views of post in " + noOfPost +"is "+ Arrays.toString(totalViewsPerPost));

    }

   public  static void sumTotal(){
        int sum=0;
       for (int i = 0; i < totalViewsPerPost.length ; i++) {
           sum+=totalViewsPerPost[i];
       }
       System.out.println("the sum of all the post is"+sum);
   }

    public  static void average(){
        int sum=0;
        for (int i = 0; i < totalViewsPerPost.length; i++) {
            sum+=totalViewsPerPost[i];
        }
        int average=0;
        average=sum/ totalViewsPerPost.length;
        System.out.println("the average is "+average);
    }
    public static void findingMax(){
        int max=0;
        for (int i = 0; i <totalViewsPerPost.length ; i++) {
                if (totalViewsPerPost.length > max) {
                    max = totalViewsPerPost[i];
                }

            System.out.println("the highest view  is" + max);
        }
    }

//    public static void findingMin(){
//        int min= 0;
//        for (int i = 0; i <totalViewsPerPost.length ; i++) {
//            if (totalViewsPerPost[i] < totalViewsPerPost.length ) {
//                min = totalViewsPerPost[i];
//            }
//
//            System.out.println("the lowest view  is" + min);
//        }
//    }



}



