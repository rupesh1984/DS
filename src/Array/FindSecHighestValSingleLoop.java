package Array;

public class FindSecHighestValSingleLoop {

    //This is o(n) solution

    public static int secHighestSingleLoop(int[] arr){
        int maxVal =0;
        int secMaxVal =0;

        for(int i =0;i<arr.length;i++){

            if(arr[i]>maxVal){
                secMaxVal =maxVal;
                maxVal = arr[i];
            }
            else if(arr[i]>secMaxVal && arr[i]< maxVal){
                secMaxVal = arr[i];
            }
        }

        return secMaxVal;
    }

    public static void main(String args[]){
        int [] arr = {2,5,3,7};
        int resVal =0;
        resVal  = secHighestSingleLoop(arr);
        System.out.println("Result is "+resVal);
    }

}
