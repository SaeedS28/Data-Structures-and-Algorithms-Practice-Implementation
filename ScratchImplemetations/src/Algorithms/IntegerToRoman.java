package Algorithms;

/**
 * RomanToInteger
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        
    }

    public String convertMe(int s) {
        StringBuilder romanNumeral = new StringBuilder();
        
        while (s>0) {
            if (s>=1000) {
                romanNumeral.append("M");
                s-=1000;
            } else if (s>=900) {
                romanNumeral.append("CM");
                s-=900;
            } else if (s >= 500) {
                romanNumeral.append("D");
                s-=500;
            } else if (s >= 400) {
                romanNumeral.append("CD");
                s-=400;
            } else if (s >= 100) {
                romanNumeral.append("C");
                s-=100;
            } else if (s >= 90) {
                romanNumeral.append("XC");
                s-=90;
            } else if(s >= 50) {
                romanNumeral.append("L");
                s-=50;
            } else if (s >= 40) {
                romanNumeral.append("XL");
                s-=40;
            } else if (s >= 10) {
                romanNumeral.append("X");
                s-=10;
            } else if (s >= 9) {
                romanNumeral.append("IX");
                s-=9;
            } else if (s >= 5) {
                romanNumeral.append("V");
                s-=5;
            } else if (s >= 4) {
                romanNumeral.append("IV");
                s-=4;
            } else {
                romanNumeral.append("I");
                s--;
            }
        }
        return romanNumeral.toString();
    }
}