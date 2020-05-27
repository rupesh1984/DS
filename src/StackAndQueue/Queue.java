package StackAndQueue;

public class Queue<V> {
    private int front;
    private int rear;
    private int currentSize;
    private int maxSize;
    private V[] arr;

    public Queue(int maxSize){
        this.front = 0;
        this.rear =-1;
        this.currentSize =0;
        this.maxSize = maxSize;
        arr = (V[]) new Object[maxSize];

    }

    public boolean checkIfFull(){
        if(this.currentSize == this.maxSize)
            return true;

        return false;
    }

    public boolean checkIfEmpty(){
        if(this.currentSize == 0)
            return true;
        return false;
    }
    public V getCurrentFront(){
        return arr[this.front];
    }
    public V getCurrentRear(){
        return arr[this.rear];
    }

    public void enqueue(V val){
        if(checkIfFull()){
            System.out.println("Size is full, Cann't add any more");
            return;
        }
        rear = (rear+1) % maxSize;
        arr[rear] = val;
        currentSize++;
    }

    public V dequeue(){
        if(checkIfEmpty()){
            System.out.println("No value in queue. Cannot remove anymore");
            return null;
        }
        V val = arr[front];
        arr[front]=null;
        front = (front+1)%maxSize;
        currentSize--;
        return val;
    }

    public void printQueue(){
        int iterate = currentSize;

        while(iterate >0){
            System.out.println("Queue is "+arr[iterate-1]);
            iterate--;
        }
    }

}

class queueImpl{
    public static void main(String args[]){
        Queue<String> qs = new Queue<String>(4);
//        qs.enqueue("Rupesh");
//        qs.enqueue("Mohit");
//        qs.enqueue("Saurabh");
//        qs.enqueue("Rana");

        qs.enqueue("1");
        String val = qs.dequeue();
        System.out.println("First Dequeue val is "+ val);
        String s1 = val + "0";
        String s2 = val +"1";
        qs.enqueue(s1);
        qs.enqueue(s2);

        System.out.println("sec Dequeue val is "+ qs.dequeue());
    }
}
