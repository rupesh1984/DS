package StackAndQueue;

public class Stack<T> {
    private int maxSize;
    private int top;
    private T arr[];

    public Stack(int sizeOfStack){
        this.maxSize = sizeOfStack;
        this.top =-1;
        arr= (T[]) new Object[sizeOfStack];
    }

    public boolean checkIfEmpty(){
        if(this.top == -1)
            return true;

        return false;
    }

    public boolean checkIfFull(){
        if(top == maxSize-1)
            return true;

        return false;
    }

    public int getMaxSize(){
        return this.maxSize;
    }

    public void push(T val){
        if(this.checkIfFull()){
            System.err.println("Error while pushing");
            return;
        }

        this.arr[++top] = val;
    }

    public T pop(){
        if(this.checkIfEmpty()){
            System.err.println("Error while pushing");
            return null;
        }
        System.out.println("I am in POP "+top);
        return this.arr[top--];
    }

    public void printStack(){
        if(this.checkIfEmpty()){
            System.err.println("No Data found ");
        }
        int val = top;
        while (val > -1){
            System.out.println("Data is "+arr[val]);
            val--;
        }

    }




}

class stackImpl{
    public static void main(String args[]){
        Stack<String> stk = new Stack<String>(4);
        System.out.println("GEt size of Stack is "+stk.getMaxSize());
        stk.push("Rupesh");
        stk.push("Saurabh");
        stk.push("Mohit");

//        stk.printStack();
//
//        stk.pop();
//        System.out.println("================");
//        stk.printStack();
//        stk.pop();
//        System.out.println("================");
//        stk.printStack();


        int max = 5;
        for(int i =-1;i<max;i++){
            int vals = (i+1)%max;
            System.out.println("Value is "+ vals);
        }



    }

}
