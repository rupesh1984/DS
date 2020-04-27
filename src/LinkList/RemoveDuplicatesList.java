package LinkList;

public class RemoveDuplicatesList<T> {
    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;

    public RemoveDuplicatesList(){
        headNode = null;
        tailNode = null;

    }

    public void insertNode(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(headNode == null){
            newNode.nextNode = headNode;
            headNode = tailNode = newNode;
        }
        else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
    }

    public void printNode(){
        Node printList = headNode;

        while(printList.nextNode!=null){
            System.out.println(" Data is "+printList.data);
            printList = printList.nextNode;

        }
        System.out.println(" Data is "+printList.data);
    }


    public void deleteDuplicate(){
        Node current = headNode;
        Node compare = null;

        while(current != null && current.nextNode !=null){
            compare = current;

            while(compare != null && compare.nextNode !=null){

                if(current.data.equals(compare.nextNode.data)){
                    compare = compare.nextNode.nextNode;
                }
                else{
                    compare = compare.nextNode;
                }


            }

            current = current.nextNode;
        }

        while(headNode.nextNode !=null){
            System.out.println(" New D is "+headNode.data);
            headNode = headNode.nextNode;
        }
        System.out.println(" New D  is "+headNode.data);
    }


}

class removeList{
    public static void main(String args[]){
        RemoveDuplicatesList<String> lists = new RemoveDuplicatesList<String>();
        lists.insertNode("Rupesh");
        lists.insertNode("Saurah");
        lists.insertNode("Mohit");
        lists.insertNode("Rupesh");
        lists.insertNode("Mohit");
        lists.deleteDuplicate();

        lists.printNode();
    }
}