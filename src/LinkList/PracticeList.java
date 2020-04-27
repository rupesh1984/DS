package LinkList;

public class PracticeList<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;

    public PracticeList(){
        headNode = null;
        tailNode = null;
    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode==null){
            newNode.nextNode = headNode;
            headNode = tailNode = newNode;

        }else{
            newNode.nextNode = null;
            tailNode = newNode;
           // tailNode.nextNode = headNode;
        }

        System.out.println("Headnode data is "+headNode.data);
        System.out.println("Tail data is "+tailNode.data);

    }

    public void insertAtLast(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode==null){
            newNode.nextNode = headNode;
            headNode = tailNode = newNode;

        }else{
            tailNode.nextNode = newNode;
            tailNode = newNode;
            //newNode.nextNode = null;
            //tailNode = newNode;
            // tailNode.nextNode = headNode;
        }

        System.out.println("Headnode data is "+headNode.data);
        System.out.println("Tail data is "+tailNode.data);
    }

    public void circularList(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode==null){
            newNode.nextNode = headNode;
            headNode = tailNode = newNode;

        }else{
            tailNode.nextNode = newNode;
            tailNode = newNode;
            tailNode.nextNode = headNode;
            //tailNode.nextNode = headNode;
        }

        System.out.println("Headnode data is "+headNode.data);
        System.out.println("Tail data is "+tailNode.data);
    }

    public void printList(){
        Node printNode = headNode;
        int loopN =0;
        System.out.println("Data is "+printNode.data);

        while(printNode.nextNode!= null && loopN < 7)
        {
            printNode = printNode.nextNode;
            System.out.println("Data is "+printNode.data);
            loopN++;
        }
    }


}

class example{
    public static void main(String args[]){
        PracticeList<String> lst = new PracticeList<String>();
//        lst.insertNode("Rupesh");
//        lst.insertNode("Suresh");
//        lst.insertNode("Umesh");
//
//        lst.circularList("Hari");
//        lst.circularList("Shaym");
//        lst.circularList("Ram");
//
//        lst.printList();

        lst.insertAtLast("Ram");
        lst.insertAtLast("Shyam");
        lst.insertAtLast("Krishna");

        lst.printList();

    }
}
