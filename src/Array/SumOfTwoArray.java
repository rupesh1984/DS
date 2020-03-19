package Array;

public class SumOfTwoArray {
	
	public static int[] findSum(int[] arr, int n) 
	  {
	    int[] result = new int[2];
	    int i =0;
	    int listIt =0;
	    while(listIt <arr.length) { // n
	    	for(int j =listIt;j<arr.length;j++) { // n
	    		if(arr[j]+arr[j+1] == n) {
	    			result[0]=arr[j];
	    			result[1]=arr[j+1];
	    			return result;
	    		}
	    	}
	    	listIt++;
	    }
	    // This function has nXn n square
	    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
	  }
	
	public static void main(String args[]) {
		int[] listArr = {3,5,1,6,8};
		int sumNo = 7;
		int[] resultArr = new int[2];
		resultArr = findSum(listArr, sumNo);
		for(int i=0;i<2;i++) {
			System.out.println("No is "+resultArr[i]);
		}
	}

}




