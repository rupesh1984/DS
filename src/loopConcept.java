public class loopConcept {

    public static int cala(){
//        int[] arr = {1,10,3,4,5};
        int[] arr = {1,10,3,4,5};
        int i=0;
        while(i<arr.length){
            if(arr[i]==3)
                return i;
            i++;


        }

        return 0;
    }

    public static void main(String args[]){
        int data =1000;
        data = cala();

        System.out.println(data);

    }
}
