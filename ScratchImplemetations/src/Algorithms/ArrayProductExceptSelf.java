package Algorithms;

public class ArrayProductExceptSelf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] arrProd= product(arr);
		
		for(int i:arrProd) {
			System.out.print(i+" ");
		}

	}
	
	public static int[] product(int[] array){
		int[] leftProd = new int[array.length];
		int[] rightProd = new int[array.length];
		int[] prod = new int[array.length];
		
		leftProd[0]=1;
		rightProd[array.length-1]=1;
		
		for(int i=1;i<array.length;i++) {
			leftProd[i]=leftProd[i-1]*array[i-1];
		}
		
		for(int i = array.length-2; i>=0; i--) {
			rightProd[i]=rightProd[i+1]*array[i+1];
		}
		
		for(int i = 0;i<array.length;i++) {
			prod[i]=leftProd[i]*rightProd[i];
		}
		
		return prod;
	}
}
