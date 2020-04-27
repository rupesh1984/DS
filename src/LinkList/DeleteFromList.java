package LinkList;

import com.sun.istack.internal.localization.NullLocalizable;

public class DeleteFromList<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public int size;

    public DeleteFromList(){
        headNode = null;
        size =0;
    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data =data;
        newNode.nextNode = this.headNode;
        this.headNode =newNode;
    }

    public void printNode(){
        Node printNode = this.headNode;

        while (printNode.nextNode != null){
            System.out.println("Data is "+ printNode.data);
            printNode = printNode.nextNode;
        }
        System.out.println("Data is "+ printNode.data);
    }

    public boolean ifEmpty(){
        if(this.headNode == null)
            return true;

        return false;
    }

    public void deleteNodeAtHead(){

        if(this.ifEmpty())
            return;

        this.headNode= this.headNode.nextNode;
    }

    public void deleteNodeAtEnd(){
        if(this.ifEmpty())
            return;

        Node traverseNode = this.headNode;
        int total =1;
        while(traverseNode.nextNode !=null)
        {
            traverseNode = traverseNode.nextNode;
            total++;
        }
        System.out.println("Size is "+total);
//        if(traverseNode.nextNode == null){
//            Node seclastNode = new Node();
//            seclastNode = traverseNode;
//
//        }
        traverseNode = this.headNode;
        int newPath =1;
        while(newPath<total){
            if(newPath == total-1){
                System.out.println("DATA jere is "+traverseNode.data);
                traverseNode.nextNode = null;
                //traverseNode = traverseNode.nextNode;
            }
            else{
                traverseNode = traverseNode.nextNode;
            }
            this.headNode = traverseNode;
           // traverseNode = traverseNode.nextNode;
            newPath++;

        }

        this.headNode = traverseNode;

    }

    public void deleteByVal(T data){

        Node traverse = this.headNode;
        while (traverse.nextNode != null){
            if(traverse.data.equals(data)){
                traverse.nextNode = traverse;
            }

            traverse= traverse.nextNode;

        }
    }


}

class DeleteNode{
    public static void main(String args[]){
        DeleteFromList<Integer> delnode = new DeleteFromList<Integer>();
        delnode.insertNode(10);
        delnode.insertNode(20);
        delnode.insertNode(30);
        delnode.insertNode(40);
        delnode.insertNode(50);
        //delnode.printNode();
        //delnode.printNode();
        //delnode.deleteNodeAtHead();
       // System.out.println("===========");
       // delnode.printNode();
        System.out.println("===========");
//        delnode.deleteNodeAtEnd();
//        delnode.printNode();

    }
}