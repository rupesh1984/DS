package LinkList;

public class DoublyLinkList<T> {

    public class Node{
        public Node nextNode;
        public Node prevNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;

    public DoublyLinkList(){
        headNode = null;
        tailNode = null;
    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data = data;
        if(headNode == null){
            newNode.nextNode = headNode;
            newNode.prevNode = headNode;
            headNode = tailNode = newNode;
        }
        else{
            newNode.nextNode = null;
            newNode.prevNode = tailNode;
            tailNode.nextNode = newNode;
//            if(tailNode.prevNode != null)
//                tailNode.prevNode = tailNode.prevNode.prevNode;
//            else
//                tailNode.prevNode = headNode;

            tailNode = newNode;
        }
    }

    public void printNode(){
        Node printList = headNode;

        while(printList.nextNode != null){
            System.out.println("Node data is "+ printList.data);
            if(printList.prevNode!=null)
             System.out.println("Node PREV data is "+ printList.prevNode.data);
            printList = printList.nextNode;
        }

        System.out.println("Node data is "+ printList.data);
        if(printList.prevNode!=null)
            System.out.println("Node PREV data is "+ printList.prevNode.data);
    }

    public void deleteNodeByValue(T val){
        System.out.println("Value to match is "+val);
        Node delNode = headNode;

        while(delNode.nextNode != null){

            if(delNode.data.equals(val)){
                System.out.println("Hete in");
                delNode.prevNode.nextNode = delNode.nextNode;
                delNode.nextNode.prevNode = delNode.prevNode;
            }
            delNode = delNode.nextNode;
        }
    }

}

class doublyList{
    public static void main(String args[]){
        DoublyLinkList<String> dlist = new DoublyLinkList<String>();
        dlist.insertNode("Rupesh");
        dlist.insertNode("mohit");
        dlist.insertNode("Arun");
        dlist.insertNode("saurabh");

        dlist.printNode();

        dlist.deleteNodeByValue("mohit");
        System.out.println("===================");
        dlist.printNode();

    }
}
