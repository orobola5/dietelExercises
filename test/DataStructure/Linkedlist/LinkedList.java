package DataStructure.Linkedlist;


import TutorialOop.Interface.List;

import java.util.NoSuchElementException;

public class LinkedList {


    public LinkedList() {
    }

    private static class Node {
        private final int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

    }
    private Node first;
    private Node last;



    //addFirst

    public void addFirst(int items) {
        Node node = new Node(items);
        if(isEmpty()) first = last = node;
        else node.next = first;
        first = node;
    }
    // addLast
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()) first = last = node;
        else last.next = node;last = node;
    }

    public boolean isEmpty(){
        return first==null;
    }
    // deletedLast
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        if(first == last){
            first=last=null;
        return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }
    public void removeLast(){
        if(isEmpty())throw new NoSuchElementException();
        if(first==last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last.next = null;
        last = previous;
    }
    private Node getPrevious(Node node){
        var current  = first;
        while (current!=null){
            if (current.next==node)return current;
            current = current.next;
        }
        return null;
    }

    // contains
    public boolean contain(int item) {
        return indexOf(item)!=-1;
    }

    // indexOf
    public int indexOf(int item){
        int index =0;
        Node current = first;
        while (current!=null){
            if (current.value==item) return index;
            current = current.next;
            index++;
        }

        return -1;
    }
    public int size() {
        return last.value;
    }

}
