package Agorithms.CTCIChap1;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * PalindromePermutation
 */
public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("ssad"));
        System.out.println(isPalindromePermutation("race car"));        
    }

    public static boolean isPalindromePermutation(String candidate){
        char[] candArray = candidate.toLowerCase().replace(" ","").toCharArray();
        HashMap<Character,Integer> charCount= new HashMap<>();

        for (int i = 0; i < candArray.length; i++) {
            if(charCount.containsKey(candArray[i])){
                charCount.replace(candArray[i], charCount.get(candArray[i])+1);
            } else {
                charCount.put(candArray[i], 1);
            }
        }

        int oddCount=0;
        for(Entry<Character,Integer>it:charCount.entrySet()){
            if(it.getValue()%2==1){
                ++oddCount;
                //System.out.println(oddCount);
            }
                //System.out.println("Key: "+it.getKey()+"\tValue:"+it.getValue());
        }

        //System.out.println("Word Length: "+candArray.length);

        if(candArray.length%2==1){
            if(oddCount==1){
                return true;
            }
        } else {
            if (oddCount==0) {
                return true;
            }
        }
        return false;
    }
}