package chapter4TddClass;

public class ClassFourNo7 {
    public static void main(String[] args) {
        //Determine the value of the variables in the statement product *= x++; after the calculation
        //is performed. Assume that all variables are type int and initially have the value 5
        int x = 5;
        int product = 5;
        product *= x++;
        System.out.println(product);
    }
}
