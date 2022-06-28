package DataStructure.Linkedlist;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list =new MyLinkedList ();
//        list.add("America");
        System.out.println("(1)"+list);
        list.add(0,"Canada");
        System.out.println("(2)"+list);
        list.add(1,"Russia");
        System.out.println("(3)"+list);
        list.add(2,"France");
        System.out.println("(4)"+list);
        list.add(3,"Germany");
        System.out.println("(5)"+list);

        list.remove(0);
        System.out.println("(6)"+list);






    }

}
