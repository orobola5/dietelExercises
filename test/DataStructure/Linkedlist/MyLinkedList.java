package DataStructure.Linkedlist;

import TutorialOop.Interface.List;


import java.util.Arrays;

public class MyLinkedList {
    public static class Node {
        private Object element;
        private Node next;

        public Node(Object element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {

    }

    public MyLinkedList(String[] news) {
        for (String s : news) {
//            add(news);
        }

    }



    public Object getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public Object getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void addFirst(Object item) {
        Node node = new Node("item");
        node.next = head;
        head = node;
        size++;
        if (tail == null) tail = head;


    }

    public void addLast(Object item) {
        Node node = new Node("item");
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;

    }



    public void add(int index, String item) {
        if (index == 0) addFirst(item);
        else if (index >= size) addLast(item);
        else {
            Node current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(item);
            (current.next).next = temp;
            size++;
        }
    }


    public Object removeFirst() {
        if (size == 0) return null;
        else {
            Node temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

    public Object removeLast() {
        if (size == 0 || size == 1) return removeFirst();
        else {
            Node current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.next;

            }
            Object temp = tail.element;
            tail = current;
            size--;
            return temp;
        }


    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            System.out.println("Null");
        else if (index == 0)
            System.out.println(removeFirst());
        else if (index == size - 1)
            System.out.println(removeLast());
//        else Node previous = head;
//        for (int i = 0; i < index; i++) {
//            previous = previous.next;
//
//        }
//

//
    }
}