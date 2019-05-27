package Algorithms;

import java.util.ArrayDeque;

/**
 * SecondLargestElementInArray
 */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        
    }

    public static String returnSecondSmallest(double[] array) {
        double largestElement = Double.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]>largestElement){
                largestElement=array[i];
            }
        }
        
        double secondLargest = Double.MIN_VALUE;
        int secondLargestIndex;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largestElement) {
                secondLargest=array[i];
                secondLargestIndex=i;
            }
        }
    }
    return "The second-largest element is "+secondLargest+", which occurs at index "+secondLargestIndex;
}