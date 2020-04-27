package LinkList;

public class UnionOfTwoList<T> {
    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;

    public UnionOfTwoList(){
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
        else{
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
    }

    public void insertAtBegin(T data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public void printList(){
        Node printlist = headNode;
        while(printlist.nextNode != null){
            System.out.println("Data is "+printlist.data);
            printlist = printlist.nextNode;
        }
        System.out.println("Data is "+printlist.data);
    }

    public void unionList(UnionOfTwoList<T> list1, UnionOfTwoList<T> list2){

        UnionOfTwoList<T>.Node finalList = list1.headNode;
        UnionOfTwoList<T>.Node newList = list1.tailNode;
       // newList = finalList;

        System.out.println("Head Node is "+ finalList.data);

        while(finalList.nextNode != null){

            finalList = finalList.nextNode;
        }



        finalList.nextNode = list2.headNode;

//        while(finalList.nextNode != null){
//            finalList = finalList.nextNode;
//        }

        while(finalList.nextNode != null){
            System.out.println("Data is "+finalList.data);
            finalList = finalList.nextNode;
        }
        System.out.println("Data is "+finalList.data);

    }

}

class unionNode{
    public static void main(String args[]){
        UnionOfTwoList<String> lists = new UnionOfTwoList<String>();
        lists.insertAtBegin("Rupesh");
        lists.insertAtBegin("Saurabh");
        lists.insertAtBegin("mohit");

        //lists.printList();
        System.out.println("=====================");
        UnionOfTwoList<String> list2 = new UnionOfTwoList<String>();
        list2.insertAtBegin("Rawat");
        list2.insertAtBegin("pandey");
        list2.insertAtBegin("rana");
        //list2.printList();

        UnionOfTwoList<String> finalList = new UnionOfTwoList<String>();

        finalList.unionList(lists, list2);
    }
}