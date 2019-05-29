package Algorithms;

import java.util.HashSet;

/**
 * LongestSubstringWithoutRepeats
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeats {
    public static void main(String[] args) {
        String str="abcabcbb";
        String str2="bbbbbbb";
        String str3="pwwkew";
        String str4 = "Samad";

        System.out.println(longestSubStringLength(str));
        System.out.println(longestSubStringLength(str2));
        System.out.println(longestSubStringLength(str3));
        System.out.println(longestSubStringLength(str4));
    }

    public static int longestSubStringLength(String s) {
        int longestCount=0;

        if(s.length() ==0 || s == null){
            return 0;
        }
        
        if(s.length()==1){
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            int j=i;
            HashSet<Character> set = new HashSet<>();
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    break;
                } else{
                    set.add(s.charAt(j));
                    j++;
                }
            }
            if (longestCount < j-i) {
                longestCount = j-i;
            }
        }
        return longestCount;
    }
}