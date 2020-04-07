package Array;

public class RightRotateArray {
    public static int[] rotateArr(int[] arr){

        int [] resArr = new int[arr.length];

        int nthVal = arr[arr.length-1];
        resArr[0] = nthVal;

                for(int j=0;j<arr.length-1;j++){
                    int k = j+1;
                    resArr[k] = arr[j];
                }


        System.out.println("Here is result "+nthVal);
        return resArr;
    }

    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        int [] resArr = new int[arr.length];
        resArr = rotateArr(arr);
        for(int i:resArr){
            System.out.println("Here is value "+i);
        }
    }


}
