package DataStructure.Set;

import TutorialOop.Interface.Arraylist;


public class Set  {

        Arraylist<Integer> arraylist=new Arraylist<>();


    public void add(int index) {
        arraylist.add(index, "item");
    }

    public int size() {
        return arraylist.size();
    }

    public void set(int counter, int replacedElement) {
        int number=0;
        for (int i = 0; i < arraylist.size(); i++) {
            if(i == counter)
                arraylist.counter= replacedElement;

        }
        System.out.println(replacedElement);


    }

    public Object getIndex(int index) {
        return arraylist.get(index);
    }


    public void remove(int index) {
        arraylist.remove(index);
    }
}




