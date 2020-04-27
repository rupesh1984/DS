package LinkList;

public class InsertAfter<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headPointer;
    public int size;

    public InsertAfter(){
        headPointer = null;
        size =0;
    }

    public void insertList(T data){
        Node linkList = new Node();
        linkList.data =data;
        linkList.nextNode= headPointer;
        headPointer = linkList;
    }

    public void printList(){
        Node printList = headPointer;

        while(printList.nextNode != null){
            System.out.println("Data is "+printList.data);
            printList = printList.nextNode;
        }
        System.out.println("Data is "+printList.data);
    }

    public void insertAfter(T val, T match){
        Node traverse = headPointer;
        Node newNode = new Node();
        newNode.data = val;

        while(traverse.nextNode != null){
            if(traverse.data == match){
                System.out.println("Matched");
                newNode.nextNode = traverse.nextNode;
                traverse.nextNode= newNode;
            }

            traverse = traverse.nextNode;
        }

    }

}

class insertAfterVal{

    public static void main(String args[]){
        InsertAfter<String> llist = new InsertAfter<String>();
        llist.insertList("Rupesh");
        llist.insertList("manoj");
        llist.insertList("Ashosk");
        llist.printList();
        llist.insertAfter("Raja", "Ashosk");
        llist.printList();
    }
}
