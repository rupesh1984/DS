package LinkList;

import java.util.Scanner;

public class LinkLIstOne<T> {

    public class Node{
        public Node node;
        public T data;

    }

    int size;
    Node headNode;

    public LinkLIstOne(){
        headNode = null;
        size = 0;
    }

    public boolean IsEmpty(){
        if(headNode == null) return true;

        return false;
    }

    public void insertNode(T data){

        Node temp = new Node();
        temp.data = data;
        temp.node = headNode;
        headNode = temp;

    }

    public void printNode(){
        Node printNode = headNode;
        if(IsEmpty())
            return;

        while (printNode.node != null){
            System.out.println("Data is "+printNode.data);
            printNode = printNode.node;
        }

    }


}

class linkList{
    public static void main(String args[]){
        LinkLIstOne<Integer> ll = new LinkLIstOne<Integer>();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Data to be inserted?");
        int total = sc.nextInt();
        int getInt =0;
        for(int i=0;i<total;i++){
            System.out.println("Enter your no ");
            getInt = sc.nextInt();
            ll.insertNode(getInt);
        }

        ll.printNode();


    }
}

