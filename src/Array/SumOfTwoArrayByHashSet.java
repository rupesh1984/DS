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

    public static void main(String args[]){
        int [] arr1 = {3,6,4,7,2};
        int n = 11;
        int [] newarr = new int[2];

        newarr = findSum(arr1, n);
        System.out.println(" First variable is "+newarr[0]);
        System.out.print(" Secand variable is "+newarr[1]);

    }



}
