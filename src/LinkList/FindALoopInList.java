package LinkList;

import javax.print.DocFlavor;

public class FindALoopInList<T> {

    public class Node{
        public Node nextnode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;

    public FindALoopInList(){
        headNode = null;
        tailNode = null;
    }

    public void circularIn(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode == null){

            newNode.nextnode = headNode;
            headNode = tailNode = newNode;
        }
        else{
            tailNode.nextnode = newNode;
            tailNode = newNode;
            tailNode.nextnode = headNode;

        }
    }

    public void normalIn(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode == null){

            newNode.nextnode = headNode;
            headNode = tailNode = newNode;
        }
        else{
            newNode.nextnode = tailNode;
            tailNode = newNode;


        }
    }

    public boolean checkIfLoop(){
        Node checkList = tailNode;
        int loopN =0;
        while(headNode != null && tailNode != null && checkList.nextnode !=null){

            if(loopN > 0 && headNode == checkList)
                return true;
            checkList = checkList.nextnode;
            loopN++;
        }

        return false;
    }



}

class findloop{
    public static void main(String args[]){
        FindALoopInList<String> lst = new FindALoopInList<String>();
//        lst.circularIn("1");
//        lst.circularIn("2");
//        lst.circularIn("3");
        lst.normalIn("1");
        lst.normalIn("2");
        lst.normalIn("3");

        if(lst.checkIfLoop())
            System.out.println("IN loop");
        else
            System.out.println("No in  loop");


    }
}