package Chapter9;

import java.util.ArrayList;
public class Diary {
    ArrayList<Entry> entries;
    private String name;
    private int password;
    private int isLock;

    public Diary(String name, int password) {
        this.name = name;
        this.password = password;
        entries = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createEntry(String title, String date, String body) {
        Entry diaryEntries = new Entry(title, date, body);
        entries.add(diaryEntries);
//    return diaryEntries;
    }

    public  int getNumberOfEntry() {
        return entries.size();
    }

    public  int findEntry(String title) {
      for (int i = 0; i < entries.size(); i++) {
           Entry entry = entries.get(i);
            if (entry.getTitle().equals(title)) {
                entries.get(i);
                return i+1;
            }
      }
       return -1;
    }


    public Entry addEntry() {
        Entry diaryEntries = new Entry("title","date","body");
        entries.add(diaryEntries);
        return diaryEntries;
    }


    public  void deleteEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if(entry.getTitle().equals(title)){
                entries.remove(entries.get(i));
            }
        }
    }

    public  void lockEntry(int password) {
        if (isLock != password) {
            System.out.println(true);
        }else
            System.out.println(false);
    }
    public int isLock() {
        return isLock;
    }


    public int openDiary() {
        return password;
    }
}