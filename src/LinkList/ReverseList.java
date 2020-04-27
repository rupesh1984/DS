package LinkList;

public class ReverseList<T> {
    public class Node{
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public int size;

    public ReverseList(){
        headNode = null;
        size =0;
    }

    public boolean ifEmpty(){
        if(headNode == null) return true;

        return false;
    }

    public void insertAtHead(T data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.nextNode = headNode;
        headNode = newnode;
        size++;
    }

    public void printList(){
        if(ifEmpty()){
            System.out.println("List is empty");
            return;
        }

        System.out.println("Size of List is "+size);
        Node temp = new Node();
        temp = headNode;

        while(temp.nextNode!=null){
            System.out.println("Node data is "+temp.data);
            temp = temp.nextNode;
        }

        if(temp.nextNode ==null)
            System.out.println("Last Node data is "+temp.data);

    }



}

class revList{
    public static void main(String args[]){
        ReverseList<String> revList = new ReverseList<String>();
        revList.insertAtHead("Rupesh");
        revList.insertAtHead("Umesh");
        revList.insertAtHead("Suresh");

        revList.printList();
    }
}

