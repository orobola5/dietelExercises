package chapter4TddClass;

public class ClassFourNo4 {
    public static void main(String[] args) {
//Write Java statements to accomplish each of the following tasks:
//a) Use one statement to assign the sum of x and y to z, then increment x by 1.
        int x =+1;
        int y = 0;
        int z = x + y;
//b) Test whether variable count is greater than 10.
// If it is, print "Count is greater than 10".
        int variableCount = 20;
        if(variableCount > 10){
            System.out.println("count is greater than 10");
        }
//c) Use one statement to decrement the variable x by 1, then subtract it from variable total
//and store the result in variable total.
        int x1 = 10;
        x1--;
        int total =-x1;
        System.out.println(total);
//d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
//this statement in two different ways.
        int divisor= 3;
        int q = 10;
//        q = q % divisor;
        q %=divisor;
        System.out.println(q);
    }


}
