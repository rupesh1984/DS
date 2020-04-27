package LinkList;

public class InsertAtLast<T> {
    public class Node{
        public Node nextNode;
        public T data;

    }

    public Node headNode;
    public int size;

    public InsertAtLast(){
        headNode= null;
        size =0;

    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public boolean isEmpty(){
        if(headNode == null) return true;

        return false;
    }

    public void insertAtEnd(T data){
        Node lastNode = new Node();
        lastNode.data = data;
        lastNode.nextNode = null;
        System.out.println("=====");
        Node traverse = headNode;


        while(traverse.nextNode!=null){
            traverse = traverse.nextNode;
        }

        traverse.nextNode = lastNode;

    }

    public void printList(){
        Node printNode = headNode;


        while(printNode.nextNode !=null){
            System.out.println("Data is "+printNode.data.toString());
            printNode = printNode.nextNode;
        }
        System.out.println("Data is "+printNode.data.toString());
    }

}

class insertAtEnd{

    public static void main(String args[]){
        InsertAtLast<String> ll = new InsertAtLast<String>();
        ll.insertNode("Rupesh");
        ll.insertNode("Mohit");
        ll.insertNode("Saurabh");
        ll.printList();
        ll.insertAtEnd("Ashish");
        ll.printList();

    }
}