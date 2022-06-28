package DataStructure.Stack;


import java.util.EmptyStackException;

public class MyStack<Object>{
 private int numberOfElements;
    public MyStack() {
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int size(){
        return numberOfElements;
    }

    public int push(int item){
        addElement(item);
        return item;
    }

    private void addElement(int item) {
        item =numberOfElements++;
//        System.out.println(item);
    }
    public int pop(){
        int len = size();
        if(isEmpty())throw new EmptyStackException();
        return numberOfElements--;

    }

    public int peek(){
        int len = size();
        if(len==0)throw new EmptyStackException();
        return numberOfElements;
    }
    public boolean isFull(){

        return false;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "numberOfElements=" + numberOfElements +
                '}';
    }
}