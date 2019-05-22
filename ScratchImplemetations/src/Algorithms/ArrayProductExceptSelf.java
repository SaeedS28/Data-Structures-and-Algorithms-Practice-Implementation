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
		int[] prod = new int[array.length];
		int placeHolder=1;
		
		for(int i=0;i<array.length;i++) {
			prod[i]=1;
		}
		
		for(int i=0; i<array.length;i++) {
			prod[i]=placeHolder;
			placeHolder = placeHolder*array[i];
		}
		
		placeHolder=1;
		
		for(int i=array.length-1;i>=0;i--) {
			prod[i]=prod[i]*placeHolder;
			placeHolder = placeHolder*array[i];
		}
		
		return prod;
	}
}
