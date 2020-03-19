package Array;

class OmitEvenFromArray {

	public static int[] removeEven(int[] arr) {
		int lengthOfArr = arr.length;
		int[] newarr = new int[lengthOfArr];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 !=0 || arr[i]==0 ){
				newarr[j] = arr[i];
				j++;
			}
				
		}
		// Write - Your - Code- Here
		return newarr; // change this and return the correct result array
	}

	public static void main(String args[]){
		int[] arrpass = {1,2,3,4,5,6,7};
		int[] finalresponse;
		finalresponse = removeEven(arrpass);
		System.out.println("HERE is reposnse"+finalresponse.length);
		for(int i=0; i<finalresponse.length; i++) {
			System.out.println("Calling "+ finalresponse[i]);
		}

	}
}