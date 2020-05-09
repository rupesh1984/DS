package StackAndQueue;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

//Generate a binary no for given input
//Example : if user enters 3 then generated binary  no should be : 11
//Example : if user enters 5 then generated binary no should be 101
public class BinaryNo<V> {
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;
    V[] arr;

    public BinaryNo(int max_size){
        this.front =0;
        this.rear =-1;
        this.maxSize = max_size;
        this.currentSize = 0;
        arr = (V[]) new Object[max_size];
    }

    public void enQueue(V val){
        rear = (rear+1) % maxSize;
        arr[rear] = val;
        currentSize++;
    }

    public V deQueue(){
        V val = arr[front];
        front = (front+1)% maxSize;
        currentSize--;
        return val;
    }
}

class BinaryNoImpl{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your no to generate binary");
        int no = scan.nextInt();
        scan.close();
        System.out.println("NO is "+ no);
        String[] resultArr = generateBin(no);
        for(int i=0;i<resultArr.length; i++){
            System.out.println("Binary is "+ resultArr[i]);
        }


    }
    public static String[] generateBin(int n){
        String[] result = new String[n];
        int maxSize = n+1;
        BinaryNo<String> qs= new BinaryNo<String>(maxSize);
        qs.enQueue("1");
        for(int i=0;i<n;i++){
            result[i] = qs.deQueue();
            String first = result[i]+"0";
            String sec = result[i]+"1";
            qs.enQueue(first);
            qs.enQueue(sec);
        }

        return result;
    }
}
