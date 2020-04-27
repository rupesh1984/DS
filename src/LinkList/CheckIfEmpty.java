package LinkList;

public class CheckIfEmpty<T> {

    public class Node{
        public T data;
        public Node nextNode;
    }

    public Node headNode;
    public int listSize;

    public CheckIfEmpty(){
        headNode = null;
        listSize =0;
    }

    public boolean ifEmpty(){
        if(headNode == null)
            return true;
        else
            return false;
    }

}

class linkListFirst{

    public static void main(String args[]){

        //The time complexity of isEmpty() method is O(1)O(1).

        CheckIfEmpty<Integer> ll = new CheckIfEmpty<Integer>();
        if(ll.ifEmpty())
            System.out.println("List is empty");
        else
            System.out.println("List is not empty");

    }
}
