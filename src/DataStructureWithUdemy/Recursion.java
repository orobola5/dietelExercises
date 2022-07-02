package DataStructureWithUdemy;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(recur(5));
        iterativeFactorial(4);


    }
   public static int recur(int number){
        if(number==0){
        return 1;
        }
        return number *recur(number-1);

    }

    public static void iterativeFactorial(int number){
        if(number==0){
            System.out.println(1);
        }
        int numbers=1;
    for (int i = 1; i <=number; i++) {
         numbers *=i;

    }
        System.out.println(numbers);
    }
}
