package LinkList;

public class FindFromList<T> {
    public class Node{
        public Node nextNode;
        public T data;
    }

    public Node headNode;
    public int size;

    public FindFromList(){
        headNode = null;
        size =0;
    }

    public void insertList(T data){
        Node linkList = new Node();
        linkList.data = data;
        linkList.nextNode = this.headNode;
        this.headNode = linkList;
    }

    public void printList(){
        Node printList = this.headNode;
        while(printList.nextNode != null){
            System.out.println("Data is "+ printList.data);
            printList = printList.nextNode;
        }
        System.out.println("Data is "+ printList.data);
    }

    public boolean verifyIfExist(T match){
        Node verifyNode = this.headNode;
        while(verifyNode.nextNode != null){
            if(verifyNode.data == match)
                return true;

            verifyNode = verifyNode.nextNode;

        }

        return false;
    }

}

class matchValue{
    public static void main(String args[]){
        FindFromList<String> list = new FindFromList<String>();
        list.insertList("Anoop");
        list.insertList("Anuj");
        list.insertList("Rupesh");
//        list.printList();

        if(list.verifyIfExist("Anujs"))
            System.out.println("Matched");
        else
            System.out.println("Not Matched");


    }
}
