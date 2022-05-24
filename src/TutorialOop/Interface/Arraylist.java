package TutorialOop.Interface;

public class Arraylist implements List {
    private int counter;
    private String[] db = new String[5];

    @Override
    public void add(String item) {
        db[counter] = item;
        counter++;
    }

    @Override
    public void add(int index, String item) {
        db[counter]= String.valueOf(index);
        counter++;

    }

    @Override
    public String get(int index) {

        return db[index];
    }

    @Override
    public void remove(String item) {
        db[counter] = item;
        counter--;
    }

    @Override
    public void remove(int index) {
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void create_new_entry(String item) {
        String[] new_db = new String[db.length];
        new_db[counter] =item;
        counter++;

    }


}