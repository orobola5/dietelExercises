package chapter4TddClass;

public class Class4No16 {
    public static void main(String[] args) {
      int x = -2;
      int total = 0;
      while (x<=10){
          int y = x+2;
          x++;
          total +=y;
          System.out.printf("y is : %d and Total is %d%n",y,total);
      }
    }
}
