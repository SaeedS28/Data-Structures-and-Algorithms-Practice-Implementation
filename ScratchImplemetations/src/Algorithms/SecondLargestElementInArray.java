package Algorithms;

/**
 * SecondLargestElementInArray
 */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        double[] array={12,13,6,22,49,-12,-124.6};
        double[] array2={10,9,8,7,6,5,4,3,2,1,9.5};

        System.out.println(returnSecondSmallest(array));
        System.out.println(returnSecondSmallest(array2));
    }

    public static String returnSecondSmallest(double[] array) {
        double largestElement = Double.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largestElement){
                largestElement=array[i];
            }
        }
        
        double secondLargest = Double.MIN_VALUE;
        int secondLargestIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largestElement) {
                secondLargest=array[i];
                secondLargestIndex=i;
            }
        }
        return "The second-largest element is "+secondLargest+", which occurs at index "+secondLargestIndex;
    }
}