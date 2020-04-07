package Array;

public class SumOfTwoArray {
	
	public static int[] findSum(int[] arr, int n) 
	  {
	    int[] result = new int[2];
	    int i =0;
	    int listIt =0;
	    if(arr[0]+arr[arr.length-1] ==n)
		{
			result[0]=arr[0];
			result[1]=arr[arr.length-1];
		}
	    while(listIt <arr.length) { // n
	    	for(int j =listIt;j<arr.length;j++) { // n
	    		int p=j+1;
	    		if(p<arr.length){
	    			System.out.println("here");
					if( arr[j]+arr[p] == n) {
						result[0]=arr[j];
						result[1]=arr[p];
						return result;
					}
				}

	    	}
	    	listIt++;
	    }
	    // This function has nXn n square
	    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
	  }
	
	public static void main(String args[]) {
		int[] listArr = {-3,4,3,90};
		int sumNo = 6;
		int[] resultArr = new int[2];
		resultArr = findSum(listArr, sumNo);
		for(int i=0;i<2;i++) {
			System.out.println("No is "+resultArr[i]);
		}
	}

}




