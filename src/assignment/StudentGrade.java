package assignment;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counterA= 0;
        int counterB =0;
        int counterC =0;
        int counterD =0;
      for(int l=1;l<=5;l++){
          System.out.println("enter student name");
          String studentName = input.next();
          System.out.println("enter student grade");
          String studentGrade = input.next().toUpperCase();

          switch(studentGrade){
              case"A":counterA++;
              break;
              case"B":counterB++;
              break;
              case"C":counterC++;
              break;
              case"D":counterD++;
              break;
              default:
                  System.out.println("invalid Grade");

          }
      }
        System.out.println(counterA + "score A");
        System.out.println(counterB + "score B");
        System.out.println(counterC + "score c");
        System.out.println(counterD + "score D");
    }
}
