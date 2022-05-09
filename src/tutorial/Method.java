 package tutorial;

public class Method {
    public static int sum(int number1,int number2){
        int result = 0;
        for(int i = number1; i <= 10;i++)
          result+=i;

        return result ;
    }

    public static void main(String[] args) {
      System.out.println("sum from 1 to 10 is :"+sum(1,10));
        System.out.println("sum from 20 to 37 is : "+sum(20,37));



       /* System.out.println("The Grade is :");
        printGrade(100.0);
        System.out.println("The sales commission is :" +salesCommission(300,5));
        System.out.print("the calender is :");
        Calender(3,1996);
        System.out.println(SQrt(10));

    }
        public static void printGrade(double score){
        if(score >= 90){
            System.out.println("Grade  A");
        } else if(score >= 80){
            System.out.println("Grade B");
        }else if(score >= 70){
            System.out.println("Grade C");
        }else if(score >= 60){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
            }

        }
        public  static int salesCommission(int amount, int rate) {
            return amount / rate;

        }

    public  static void Calender( int month,int year) {
        String calender = month +":"+year;
        System.out.println(calender);
    }

    public static int SQrt(int number){
       return (int) Math.sqrt(number);
    }*/

    }
}