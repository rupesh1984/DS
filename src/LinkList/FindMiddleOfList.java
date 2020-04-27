package LinkList;

public class FindMiddleOfList<T> {

    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public Node tailNode;
    public T responseData;

    public FindMiddleOfList(){
        headNode = null;
        tailNode = null;

    }

    public void insertList(T data){
        Node newNode =  new Node();
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

    public void setRespose(T resp){
        responseData = resp;

    }

    public void printNode(){
        Node printNode = headNode;

        while(printNode.nextNode != null){
            System.out.println("Data is "+ printNode.data);
            printNode = printNode.nextNode;

        }
        System.out.println("Data is "+ printNode.data);

    }



}

class findMiddle {
    public static void main(String args[]) {
        FindMiddleOfList<String> list = new FindMiddleOfList<String>();
        list.insertList("Rupesh");
        list.insertList("Mahesh");
        list.insertList("saurabh");
        list.insertList("mohit");
        list.insertList("Sanjjev");
        list.insertList("Alok");
        list.insertList("Ajay");
       // list.responseData = findMiddle(list);

        list.printNode();
       // String response = findMiddle(list);
        System.out.println("Middle is "+ findMiddle(list));
    }


    public static <T> Object findMiddle(FindMiddleOfList<T> list) {
        if(list.headNode == null)
            return null;

        FindMiddleOfList.Node mid = list.headNode;
        FindMiddleOfList.Node current = list.headNode;

        while(mid != null && current != null && current.nextNode != null){

            current = current.nextNode.nextNode;
            if(mid.nextNode!=null){
                mid = mid.nextNode;
            }

        }
        return mid.data;

    }

}