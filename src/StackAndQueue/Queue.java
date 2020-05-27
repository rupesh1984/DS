package StackAndQueue;

public class Queue<T> {
    private  int maxSize;
    private T[] arr;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size ){
        this.maxSize = size;
        arr = (T[]) new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize =0;
    }

    public boolean checkIfFull(){
        if(this.currentSize == this.maxSize)
            return true;

        return false;
    }

    public int getMaxSize(){
        return this.maxSize;
    }

    public int getCurrentSize(){
        return this.currentSize;
    }

    public boolean checkIfEmpty(){
        if(this.currentSize ==0)
            return true;

        return false;
    }

    public T getCurrentFront(){
        return this.arr[this.front];
    }

    public T getCurrentRear(){
        return this.arr[this.rear];
    }

    public void enQueue(T val){
        if(checkIfFull()){
            System.err.println("Queue is Already Full");
            return;
        }

        this.rear = (this.rear +1 ) % maxSize;
        this.arr[this.rear] = val;
        this.currentSize++;

    }

    public T deQueue(){
        if(checkIfEmpty()){
            System.err.println("Queue is Empty");
            return null;
        }
        T temp = this.arr[this.front];
        this.front = (this.front +1 ) % this.maxSize;
        this.currentSize --;
        return temp;
    }

}

class ququeImpl{
    public static void main(String args[]){
        Queue<String> qs = new Queue<String>(4);
        qs.enQueue("Rupesh");
        qs.enQueue("Saurabh");
        System.out.println("Current front is "+qs.getCurrentFront());
        System.out.println("Current Rear is "+qs.getCurrentRear());

        qs.deQueue();
        System.out.println("Current front is "+qs.getCurrentFront());
        System.out.println("Current Rear is "+qs.getCurrentRear());
    }
}
