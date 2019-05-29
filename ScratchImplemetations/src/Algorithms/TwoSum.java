package Algorithms;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr={1,22,45,28,123,44};
        int[] indices = twoSumCalculate(arr,67);

        System.out.print("[ ");
        for (int var : indices) {
            System.out.print(var+" ");
        }
        System.out.println("]");
    }

    public static int[] twoSumCalculate(int[] array, int target) {
        int[] values = new int[2];
        values[0]=-1;
        values[1]=-1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                //System.out.println("Pair (i,j): "+ array[i]+","+array[j]);
                if(array[i]+array[j]==target){
                    values[0]=i;
                    values[1]=j;
                    return values;
                }
            }
        }
        return values;
    }
}