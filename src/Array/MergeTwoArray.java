package Array;

public class MergeTwoArray {
	
	  public static int totalLength = 0;
	    // merge arr1 and arr2 into a new result array 
	    public static int[] mergeArrays(int[] arr1, int[] arr2) 
	    {  
	      for(int i=0;i<arr1.length;i++) {
				totalLength++;
			}
			for(int j=0;j<arr2.length;j++) {
				totalLength++;
			}
			int[] mergeArr = new int[totalLength];
			int tno =0;
			for(int tnum=0, i=0,j=0;tnum<totalLength;i++,j++) {
				if(i<arr1.length) {
					mergeArr[tnum] = arr1[i];
					tnum++;
				}
					
					
				if(j<arr2.length) {
					mergeArr[tnum] = arr2[i];
					tnum++;
				}
					
			}
	      // write your code here
	      return mergeArr; // make a new resultant array and return your results in that
	    } 


	    public static void main(String args[]) {
			int[] arr1 = {1,3,5,7};
			int[] arr2 = {2,4,6,8};
			int[] arr3;
			
			arr3 = mergeArrays(arr1, arr2);
			 for(int i=0;i<arr3.length;i++) {
			 	System.out.println("Arr3 is "+arr3[i]);
			 }
			
		}

}
