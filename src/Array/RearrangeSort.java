package Array;

public class RearrangeSort {

    public static int[] rearrangeSort(int[] arr){

        //The time complexity of this problem is O(n)O(n) as the array is iterated over once.

        int[] newarr = new int[arr.length];
        int newArrayIndex =0;
        int maxArrayIndex = arr.length-1;
        boolean switcher = true;

        for(int i=0;i<arr.length;i++){

            if(switcher){
                newarr[i] = arr[maxArrayIndex--];
            }
            else
            {
                newarr[i] = arr[newArrayIndex++];
            }

            switcher = !switcher;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = newarr[i];
        }


        for(int i:arr){
            System.out.println("RES "+i);
        }

        return newarr;

    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        rearrangeSort(arr);

    }

}
