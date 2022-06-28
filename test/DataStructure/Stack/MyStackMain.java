package DataStructure.Stack;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
//       int myItems = myStack.pop();
//        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack);


    }
}
