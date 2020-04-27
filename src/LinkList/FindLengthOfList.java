package LinkList;

public class FindLengthOfList<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public FindLengthOfList(){
        this.headNode = null;
        this.tailNode = null;
        this.size =1;

    }

    public boolean IfEmpty(){
        if(this.headNode == null) return true;

        return false;
    }

    public void insertAtHead(T data){
        Node newNode = new Node();
        newNode.data= data;

        if(IfEmpty()){
            newNode.nextNode = this.headNode;
            this.headNode = this.tailNode = newNode;
        }
        else{

            newNode.nextNode = this.tailNode;
            this.tailNode = newNode;
        }
    }

    public void printNode(){
        Node printNode = this.tailNode;
        while(printNode.nextNode != null){
            System.out.println("Data is "+ printNode.data);
            printNode = printNode.nextNode;
        }
        System.out.println("Data is "+ printNode.data);

    }

    public int sizeofList(){
        Node countList = this.tailNode;

        if(this.IfEmpty())
            return 0;

        while(countList.nextNode != null){

            countList= countList.nextNode;
            this.size ++;
        }

        return this.size;
    }

}

class lengthList{
    public static void main(String args[]){
        FindLengthOfList<String> lists = new FindLengthOfList<String>();
        lists.insertAtHead("Rupesh");
        lists.insertAtHead("Saurabh");
        lists.insertAtHead("Mohit");
        lists.insertAtHead("Rana");

        lists.printNode();
        int totalSize =0;

        totalSize       = lists.sizeofList();
        System.out.println("Total Size of list is "+ totalSize);
    }

}
