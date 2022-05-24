package Chapter9.Diary;


import java.util.ArrayList;
import java.util.Scanner;

public class DiaryMain {
    private static Diary diary;
    private static ArrayList<Entry>entries;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
      while (x != -1){
          instructions();
          int selection = input.nextInt();
          switch (selection){
              case 1: createEntry();
              break;
              case 2:numberOfEntries();
              break;
              case 3:
                  break;
              case 4: x =-1;
                      break;

          }
      }

    }


    public static void numberOfEntries(){
        int numberOfEntries = diary.getNumberOfEntry();
        System.out.println("you have "+numberOfEntries+"entries in your diary");
    }

    public static void instructions() {
        System.out.println("""
                Diary
                select
                1.Create Entry
                2.get number of entry
                3.number of entry
                4.quit application
                
                """);
    }

    public static void createEntry() {
        System.out.println("enter title:");
        String title = input.next();
        System.out.println("enter date:");
        String date = input.next();
        System.out.println("enter body:");
        String body = input.next();
        diary.createEntry(title,date,body);
    }
}
