package DataStructure.Arraylist;

import java.util.Arrays;
import java.util.Objects;

public class ImplementList {
    private int counter;

     private  String[] news;

    public ImplementList() {
        news = new String[5];
    }

    public void add(String items) {
        news[counter] = items;
        counter++;
    }

    public int size() {
        return counter;
    }

    public String get(int index) {

        return news[index];
    }

    public void add(int index, String item) {
        for (int i = 0; i < size(); i++) {

        }
        news[counter] = String.valueOf(index);
        counter++;

    }

    public void remove(String item) {
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(news[i], item)) {
                news[i] = news[i + 1];
            }
        }

        counter--;
        System.out.println(Arrays.toString(news));
    }

//            for (int i = 0; i < news.length; i++) {
//            if (Objects.equals(news[i], item)) {
//                news[counter] = item;
//            }


    public void remove(int index) {
       if (index < 0 || index > (counter-1)){
         throw new IndexOutOfBoundsException();
       }
        String items=news[index];
       for (int i = index; i < counter-1; i++) {
            news[i] = news[i+1];
       }
        counter--;
        System.out.println(items+" removed from list");
        System.out.println(Arrays.toString(news));

    }
    public void newEntry(int index, String item) {
        if (size() == counter) {
            String[] new_news = new String[counter * 2];
            for (index = 0; index < counter; index++) {
                new_news[index] = news[index +1];
                news = new_news;
            }
            System.out.println(item+"  inserted into list");
            news[counter] = item;
            counter++;
            System.out.println(Arrays.toString(news));
        }
    }
    public int indexOf(String item){
        int index=0;
        for (int i = 0; i < counter; i++) {
            if (Objects.equals(news[i], item)) {
                index = i;
            }
        }
        return index;
    }
    public boolean contains(String data){
        System.out.println("is " + data + " contains in the array  " + indexOf(data));
        return indexOf(data) !=-1;

    }
    public void clear(){
        this.counter = 0;
    }
    public  boolean isEmpty(){
        return size() ==0;
    }

    public int set(int counter, int replacedElement) {
        int number=0;
        for (int i = 0; i < size(); i++) {
            if(i == counter)
                counter= replacedElement;
        }
        System.out.println(replacedElement);
        return number;
    }



}
