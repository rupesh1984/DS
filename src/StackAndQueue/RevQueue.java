package StackAndQueue;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class RevQueue<String> {
    private int maxSize;
    private String[] arr;
    private int front;
    private int rear;
    private int currentSize;

    public RevQueue(int size){
        this.maxSize = size;
        this.front = -1;
        this.rear =0;
        arr = (String[]) new Object[size];
        this.currentSize=0;
    }

    public void enQueue(String val){
        this.rear = (this.rear+1)%this.maxSize;
        this.arr[this.rear] = val;
        this.currentSize++;

    }

    public String deQueue(){
        String returnVal;
        returnVal = this.arr[this.front];
        this.front = (this.front+1) % this.maxSize;
        this.currentSize--;
        return returnVal;
    }

    public void printQueue(){
        for(int i =0; i<this.currentSize; i++){
            System.out.println("Value of Queue is "+this.arr[i]);
        }
        for(String ele: this.arr){
            System.out.println("Value is "+ele);
        }
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public String[] getArr() {
        return arr;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}

class revQueueByK{
    public static void main(String args[]){
        RevQueue<String> queue  = new RevQueue<String>(5);
        Scanner sc = new Scanner(System.in);
        String queVal ="";
        String revVal ="";
        for(int i=0;i<4;i++){
            System.out.println("Enter Queue value");
            queVal = sc.nextLine();
            queue.enQueue(queVal);
        }
        queue.printQueue();
        System.out.println("Enter the item to be Reversed");
        revVal = sc.nextLine();
        int curSize = queue.getMaxSize();
        String[] arr = new String[5];
        arr = Arrays.stream(queue.getArr()).toArray(String[]::new);
        int index =-1;
        for(int i=0;i<curSize;i++){
            if(arr[i]!= null &&  arr[i].equals("Sonu") ){
                System.out.println("HErere");
                index =i;
                break;
            }

        }
        int nextInd = index;
        for(int i =0; i<=nextInd; i++){
            arr[i] = arr[index];
            index--;
        }

        for(String printElem : arr){
            System.out.println("Item is "+printElem);
        }
    }
}