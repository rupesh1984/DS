package StackAndQueue;

 class ArrangeArr {
    public static void main(String args[]){
        int rear = -1;
        int size =5;
        for(int i=0;i<10;i++){
            rear = (rear +1) % size;
            System.out.println("Rear  value is "+rear);
            System.out.println("Size is "+size);
            System.out.println("=====================");
        }

    }
}
