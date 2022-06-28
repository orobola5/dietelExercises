package DataStructure.Queue;

import TutorialOop.Polymorphism.Student;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Student[] queue;
    private int front;
    private int back;

    public ArrayQueue(int noOfStudent) {
        this.queue = new Student[noOfStudent];

    }


    public void addStudent(Student student) {
        if(back == queue.length){
            Student[] newArray = new Student[2* queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[back] = student;
        back++;

    }


    public int getIndex() {
        return queue.length;
    }

    public void removeStudent(Student student) {
        student = queue[front];
        queue[front]=null;
        front++;
        if(size() ==0){
            front=0;
            back=0;
        }
        System.out.println(student);
    }
    public int size(){
        return back-front;
    }

    public Student peek() {
        if(size()==0){
          throw new NoSuchElementException();
        }return queue[front];
    }

}
