package Array;

//Lets solve the problme with hash set in Java

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoArrayByHashSet {

    public static int[] findSum(int [] arr, int n){
        int [] result = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        for(int i:arr){

            if(set.contains(n-i)){
                result[0] = i;
                result[1] = n-i;

            }
            set.add(i);
        }

        return result;
    }

    public static int[] findSumArr(int[] arr, int n){
        int[] res = new int[2];
        int rv = 0;
        Set<Integer> newset = new HashSet<Integer>();
        for(int i =0; i<arr.length; i++){
            if(newset.contains(n-arr[i])){
                res[0] = i;
                rv =n-arr[i];
                break;
            }
            newset.add(arr[i]);
        }

        System.out.println("rv is "+rv);
        for(int j=0;j<arr.length;j++){
            if(arr[j]== rv && res[0]!=j)
                res[1]=j;
        }
        return res;

    }

    public static void bestSolution(int[] arr, int target){
        int[] result = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[j] == target-arr[i] && i !=j){
                    result[0] = i;
                    result[1] = j;

                }
            }
        }

        System.out.println("Sum of index array is "+result[0]);
        System.out.println("Sum of index array 2 is "+result[1]);

    }



    public static void main(String args[]){
        int [] arr1 = {-3,5,3,6,8};
        int n = 0;
        int [] newarr = new int[2];

        //newarr = findSum(arr1, n);
//        newarr =findSumArr(arr1,n);
//        System.out.println(" First variable is "+newarr[0]);
//        System.out.print(" Secand variable is "+newarr[1]);
        bestSolution(arr1, n);

    }



}

// So arr = [3,6,4,7,2]
// n = 11
//11-3= 8
//11-6=5
//11-4=7  , 7 found in arr so here is answer for first i and n-i which is 11-7 =4 is another value
//This code works in O(n)O(n) as the whole array is iterated over once.