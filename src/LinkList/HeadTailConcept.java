package LinkList;

import java.util.TreeSet;

public class HeadTailConcept<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public HeadTailConcept(){
        headNode = null;
        tailNode = null;
        size =0;
    }

    public boolean checkIfEmpty(){
        if(this.headNode == null) return true;

        return false;
    }

    public void inserNode(T data){



        if(this.headNode== null){
            Node newNode = new Node();
            newNode.data = data;
            newNode.nextNode = this.headNode;
            this.headNode = this.tailNode = newNode;
        }
        else
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.nextNode = this.tailNode;
            this.tailNode = newNode;
        }
    }

    public void printList(){
        Node traverseNode = this.tailNode;

        while (traverseNode.nextNode!= null){

            System.out.println("DATA is "+ traverseNode.data);
            traverseNode = traverseNode.nextNode;
        }
        System.out.println("DATA is "+ traverseNode.data);
    }

    public void DeleteFromBegining(){

        Node newNode = new Node();

        if(this.headNode != this.tailNode){

            newNode = tailNode;
            Node currentNode = this.headNode;
            this.headNode = currentNode.nextNode;


        }
        else
        {
            this.headNode= this.tailNode = null;
        }
    }



}

class headTail{
    public static void main(String args[]){
        HeadTailConcept<Integer> nodeList = new HeadTailConcept<Integer>();
        nodeList.inserNode(10);
        nodeList.inserNode(20);
        nodeList.inserNode(30);
        nodeList.printList();
        System.out.println("==============");
        nodeList.DeleteFromBegining();
        nodeList.printList();
    }
}
