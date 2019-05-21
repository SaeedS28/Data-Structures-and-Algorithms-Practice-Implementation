package Algorithms;

public class MinMaxSumNMinus1Array {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] sums=minMaxSum(arr);
		
		System.out.println("Min sum: " + sums[0]+"\tMax sum: "+sums[1]);
	}

	public static int[] minMaxSum(int[] array) {
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		int[] retVals = new int[2];

		int tmpSum = 0;
		int tmpPtr = 0;
		int i = 0;

		while (tmpPtr < array.length) {
			for(i=0;i<array.length;i++) {
				if(i==tmpPtr) {
					i++;
					if(i==array.length) {
						break;
					}
				}
				tmpSum=tmpSum+array[i];
			}
			
			if(tmpSum<minSum) {
				minSum=tmpSum;
			}
			
			if(tmpSum>maxSum) {
				maxSum=tmpSum;
			}
			System.out.println(tmpSum+"\tminSum: "+minSum+"\tmaxSum: "+maxSum);
			
			tmpSum=0;
			tmpPtr++;
		}

		retVals[0]=minSum;
		retVals[1]=maxSum;
		return retVals;

	}
}
