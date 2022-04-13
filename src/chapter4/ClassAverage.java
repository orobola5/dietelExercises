package chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        int total = 0;
        int x = -2;
         while(x <= 10){
             int y = x+ 2;
             x++;
             total = total + y;
             System.out.printf("y is : %d and Total is : %d\n",y,total);
         }

       /* int x =7;
        int y = 3;
        x=y++;
        System.out.println(x);
        x= ++y;
        System.out.println(x);*/

    }
       /* System.out.println("the factor is :");
        findFactors(5);
//        Scanner input = new Scanner(System.in);
    }
        public static int findFactors(int number){
        int factors = 0;
        number = 5;
        for(int i = 1;i<=number;i++){
            factors = i + number;
            System.out.println(factors);

            }
return factors;

        }*/
       /* int passes = 0;
        int fails = 0;
        int studentCounter = 1;
        while (studentCounter<=10){
            System.out.print("Enter the Exam result(1= pass,2=fail): ");
            int result = input.nextInt();
            if(result==1){
                passes++;
            }else {
                fails++;
            }
            studentCounter++;
        }
        System.out.printf("Passed : %d%n Failed : %d%n",passes,fails);
        if(passes>=8){
            System.out.println("Bonus to instructor");
        }*/

        /*int total = 0;
        int counter = 0;
        System.out.print("input the first grade or -1 to quit :");
        int grades = input.nextInt();
        while(grades !=-1){
            total = total+grades;
            counter++;
            System.out.print("input the next grade or -1 to quit :");
            grades = input.nextInt();
        }
        if( counter != 0){
            double classAverage = total/counter;
            System.out.printf( "%nThe class Average is %.2f%n", classAverage);
        }else {
            System.out.println("No grades were entered");
        }
        System.out.printf("the total of %d grades entered is %d%n",counter,total);*/


       /* Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        while(gradeCounter<=10){
            System.out.print("Enter grade :");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
        }
int average = total/10;
        System.out.printf("%nTotal of all 10grades is %d%n",total);
        System.out.println("The Average is :"+ average);*/

    }

