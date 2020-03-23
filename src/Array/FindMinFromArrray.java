package Array;

public class FindMinFromArrray {

    public static int findMinimum(int[] arr) {
        // Write your code here
        //return Integer.MIN_VALUE;

        int i = 0;
        int minVal =10000000;
        while(i<arr.length){

            for(int j =i; j<arr.length; j++){
                if(arr[i] < arr[j] && minVal > arr[i])
                    minVal = arr[i];
                else if(arr[j] < arr[i] && minVal > arr[j])
                    minVal = arr[j];
            }
            i++;
        }

        return  minVal;
    }

    public static int findMinBySingleLoop(int[] arr){

        int minVal = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minVal)
                minVal =arr[i];
        }

        return minVal;
    }

    public static void main(String args[]){
        int minVal =0;
        int[] arr = {10,14,18,1001,3,12};
        minVal = findMinimum(arr);
        System.out.println("Here is Min "+minVal);
        int newMin = 0;
        newMin = findMinBySingleLoop(arr);
        System.out.println("Min val single loop is "+newMin);
    }

}
