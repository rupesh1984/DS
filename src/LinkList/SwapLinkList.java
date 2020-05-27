package LinkList;

public class SwapLinkList<T> {
    public class Node{
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public Node tailNode;

    public SwapLinkList(){
        this.headNode = null;
        this.tailNode = null;
    }

    public void createList(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode == null){
            headNode = tailNode = newNode;
        }
        else{
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
    }

    public void printList(){
        Node printList = headNode;
        while(printList.nextNode != null){
            System.out.println("Data is "+printList.data);
            printList = printList.nextNode;
        }
        System.out.println("Data is "+printList.data);
    }

    public void swapList(){
        Node swapList = headNode;
        while (swapList != null && swapList.nextNode != null){
            T tempVal = swapList.data;
            swapList.data = swapList.nextNode.data;
            swapList.nextNode.data = tempVal;
            swapList = swapList.nextNode.nextNode;
        }
    }
}

class swapList{
    public static void main(String args[]){
        SwapLinkList<Integer> ll = new SwapLinkList<Integer>();
        ll.createList(1);
        ll.createList(2);
        ll.createList(3);
        ll.createList(4);
        ll.createList(5);

        ll.printList();

        ll.swapList();
        System.out.println("====================");
        ll.printList();
    }
}
