package LinkList;

public class FindNthFromEnd<T> {

    public class Node{
        public Node nextData;
        public T data;
    }

    public Node headNode;
    public Node tailNode;
    public int totalListSize;

    public FindNthFromEnd(){
        headNode = null;
        tailNode = null;
        totalListSize =0;
    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode == null){
            newNode.nextData = headNode;
            headNode = tailNode = newNode;

        }
        else{
            tailNode.nextData = newNode;
            tailNode = newNode;
        }
        totalListSize++;
    }

    public void printNode(){
        Node printList = headNode;

        while(headNode!= null){
            System.out.println("DATA is "+printList.data);

            printList = printList.nextData;
        }
    }

    public <T> Object findNth(int nth){

        int nodeNumber = totalListSize - nth;
        Node findNode = headNode;

        int init =0;

        while (findNode.nextData != null){
            if(nodeNumber == init){
                return findNode.data;
            }
            findNode = findNode.nextData;
            init++;

        }
        return 0;
    }

}

class fromEnd{
    public static void main(String args[]){
        FindNthFromEnd<String> list = new FindNthFromEnd<String >();
        list.insertNode("Rupesh");
        list.insertNode("Mohit");
        list.insertNode("Rana");
        list.insertNode("Saurabh");
        list.insertNode("Ashish");
        list.insertNode("Amar");

        System.out.println("Value is "+list.findNth(2));
    }
}