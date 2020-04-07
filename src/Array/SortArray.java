package Array;

public class SortArray {

    public static void sortAnArray(int[] arr){

        int[] resArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for(int i:arr){
            System.out.println("Val is "+i);
        }

    }

    public static void main(String args[]){
        int[] arr ={1,3,6,2};
        sortAnArray(arr);
    }


}
