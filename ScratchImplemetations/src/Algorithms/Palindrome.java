package Algorithms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input;
		
		System.out.print("Enter a word to see if it is a palindrome: ");
		input=scan.nextLine();
		
		char[] stringToChar = input.toLowerCase().replaceAll(" ", "").toCharArray();
		
		int i=0;
		int j=stringToChar.length-1;
		boolean isPalindrome=true;
		
		while(i<j) {
			if(stringToChar[i]!=stringToChar[j]) {
				isPalindrome=false;
				break;
			}
			i++;
			j--;
		}
		
		if(isPalindrome) {
			System.out.println("The String ("+ input+") is a palindrome");
		} else {
			System.out.println("The String ("+ input+") is not a palindrome");
		}
		
		scan.close();
	}

}
