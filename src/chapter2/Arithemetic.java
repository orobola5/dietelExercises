package chapter2;

import java.util.Scanner;

   public class Arithemetic {

     public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int user1;
  	int user2;
	int user3;
	System.out.println("Enter user 1");
	user1 = input.nextInt();
	
	System.out.println("Enter user 2");
	user2 = input.nextInt();
	
	System.out.println("Enter user 3");
	user3 = input.nextInt();
	
	int sum = user1 + user2 + user3;
	System.out.println("the sum :" + sum);
	
	int average = sum/3;	
	System.out.println(" the average :" + average);
	
	
	int product = user1 * user2 * user3;
	System.out.println(" the product :" + product);
	
	if(user1<user2 && user1<user3){
	System.out.println("the smallest is :" + user1);
}

	if(user2<user1 && user2<user3){
	System.out.println(" the smallest is :"+ user2);
}

	if (user3<user1 && user3<user2){
	System.out.println("the smallest is :" + user3);
}

	if(user1>user2 && user1>user3){
	System.out.println("the largest is :" + user1);
}
	if(user2>user1 && user2>user3){
	System.out.println(" the largest is :"+ user2);
}
	if (user3>user1 && user3>user2 ){
	System.out.println("the largest is :" + user3);
}
   }

}