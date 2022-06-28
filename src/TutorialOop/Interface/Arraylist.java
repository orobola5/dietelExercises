package TutorialOop.Interface;

import java.util.Arrays;

public class Arraylist<I extends Object> implements List {

    public int counter;


    private Object[] db;
private int length =5 ;
    public Arraylist() {
        db =  new Object[length*2];
    }
    public void print() {
        for (int i = 0; i < counter; i++) {
            System.out.println(db[i]);
        }
    }

    public void insert(String element){
        if(db.length == counter) {}
            Object[] new_db = new Object[counter*2];
            for (int i = 0; i < counter; i++) {
                new_db[i] = db[i];
                db = new_db;
            }
            db[counter++] = element;
        System.out.println(Arrays.toString(db));
    }


    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
        System.out.println(Arrays.deepToString(db));

    }

    @Override
    public void add(int index, String item) {
        db[counter]= index;
        counter++;
        System.out.println(Arrays.deepToString(db));
    }

    @Override
    public Object get(int index) {

        return db[index];
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < counter; i++) {
            db[i] = db[i + 1];
            db[counter] = item;
        }
        counter--;
    }

    @Override
    public void remove(int index) {
     for (int i = index; i < counter; i++) {
                db[i] = db[i + 1];
     }
        counter--;
     System.out.println(Arrays.deepToString(db));
        }

    @Override
    public int size() {
        return counter;

    }



    }


