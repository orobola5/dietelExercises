package DataStructure.Queue;



public class Queue {

    private  final int size;
    private int back;
    private int front;
    private final int[] myQueue;
    private int counter ;

    public Queue(int size) {
        this.size = size;
        this.myQueue = new int[size];
        this.counter=0;
        this.front = 0;
        back = -1;


    }

    public boolean isEmpty() {
        return size()==0;
    }

    public int size() {
        return back -front ;
    }

    public void insert(int items) {
        if(back == size-1){
            back = -1;
        }
        back++;
        myQueue[back]=items;
        counter++;
    }
    public void view(){
        System.out.print("[");
        for (int j : myQueue) {
            System.out.print(j + " ");
        }
        System.out.print("]");
    }
    public int remove(){
       int temp = myQueue[front];
       front++;
       if(front==size){
           front=0;
       }
        counter--;
        System.out.println(temp);
        return temp;
    }


    public int peek() {
        return myQueue[front];
    }

    public boolean isFull() {
        return counter==size;
    }
}
