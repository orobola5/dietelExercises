package chapter4TddClass;

public class ClassFourNo5And6 {
    public static void main(String[] args) {

        calculateNo6(1);
    }

    public static void no5(){
// Write a Java statement to accomplish each of the following tasks:
//a) Declare variable sum of type int and initialize it to 0.
            int sum =0;
//b) Declare variable x of type int and initialize it to 1.
            int x = 1;
//c) Add variable x to variable sum, and assign the result to variable sum.
            sum +=x;
//d) Print "The sum is: ", followed by the value of variable sum
            System.out.println("the sum is :"+sum);
    }

    public static void calculateNo6(int count) {
 //Combine the statements that you wrote in Exercise 4.5 into a Java application that calculates and prints the sum of the integers from 1 to 10. Use a while statement to loop through the
        // calculation and increment statements. The loop should terminate when the value of x becomes 11
        int sum = 0;

        while (count <= 10){
            sum+=count;
            count++;
        }
        System.out.println(sum);
    }
}
