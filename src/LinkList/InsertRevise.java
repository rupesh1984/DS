package LinkList;

public class InsertRevise<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public int size;

    public InsertRevise(){
        headNode = null;
        size = 0;
    }

    public void insertN(T data){

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public void printNode(){
        Node printNode = headNode;

        while (printNode.nextNode!=null){
            System.out.println("Data is "+printNode.data);
            printNode = printNode.nextNode;
        }
    }


}

class simpleNode{

    public static void main(String args[]){
        InsertRevise<Integer> lists = new InsertRevise<Integer>();
        lists.insertN(11);
        lists.insertN(22);
        lists.insertN(33);
        lists.printNode();
    }

}
