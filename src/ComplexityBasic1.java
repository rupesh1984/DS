/* Simple size of loop n */

public class ComplexityBasic1 {

	public static void main(String args[]) {
		int x =10; // 1 step
		int total =0; // 1 step
		for(int i=0; i<x; i++) { // n step
			total+=1; 
		}
		System.out.print("Total is "+ total); // 1 step
	}
	
}

// Total runing time complexity is : 5n+5 
// How ?
// int x =10 : 1
// int total=0 : 1+1
// for(int i =0) : 1+1+1
// for(i<x) so this will run n+1 times . e,g if n =6 then i from 0,1,2,3,4,5,6 so total 7 thats why : n+1
//		Final here is : 1+1+1+n+1
// for(i++) : increment + assignment every time : n+n = 2n : 4+n+2n
// total +=1 : increment+ assignment every time : n+n = 2n : 4+3n+2n
// System.out.print("Total is "+ total); : 1 time : 4+5n+1
// 5n+5