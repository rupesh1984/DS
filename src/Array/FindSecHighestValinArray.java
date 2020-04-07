package Array;

public class FindSecHighestValinArray {

    //The time complexity of the solution is in O(n)O(n) since the list is traversed twice but in separate loops.
    // Which means O(n + n) = O(n)O(n+n)⇒O(n)
    public static int findSecandLargest(int[] arr){

        int maxVal = Integer.MIN_VALUE;
        int secMaxVal = Integer.MIN_VALUE;

        //For finding max val
        for(int i =0;i<arr.length;i++){

            if(arr[i]>maxVal){
                maxVal =arr[i];
            }
        }

        //For finding secaond max val is
        for(int i =0;i<arr.length;i++){
            if(arr[i]>secMaxVal && arr[i]!=maxVal){
                secMaxVal=arr[i];
            }
        }

        return secMaxVal;


    }

    public static void main(String args[]){

        int [] arr = {2,5,3,7};
        int resultSecMaxVal = findSecandLargest(arr);
        System.out.println("Secanond max value is "+resultSecMaxVal);

    }
}
