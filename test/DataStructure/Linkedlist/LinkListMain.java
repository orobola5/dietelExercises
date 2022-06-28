package DataStructure.Linkedlist;

public class LinkListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        System.out.println("(1)"+list);
        list.addLast(20);
        System.out.println("(2)"+list);
        list.addLast(30);
        System.out.println("(3)"+list);
        list.addLast(40);
        System.out.println("(4)"+list);
       list.removeFirst();
        System.out.println("(1)"+list);
        list.removeLast();
        System.out.println("(4)"+list);


    }
}




