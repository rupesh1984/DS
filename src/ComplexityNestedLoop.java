// Nested loop Big(O) - runing time complexity 

public class ComplexityNestedLoop {

	public static void main(String args[]) {
		int x =5; // 1 step
		int total = 0; //1 step
		for(int i=0; i<x; i++) { // 1+n+1+ 2n = 2+3n
			for(int j=0; j<x; j++) {
				total ++;
			}
		}
		
		System.out.println("Total is "+total);
	}
	
}
