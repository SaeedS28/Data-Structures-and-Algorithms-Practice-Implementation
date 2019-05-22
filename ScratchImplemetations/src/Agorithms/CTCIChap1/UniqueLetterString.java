package Agorithms.CTCIChap1;

import java.util.Arrays;

public class UniqueLetterString {

	public static void main(String[] args) {
		String string1="Power";
		String string2="Saad";
		
		System.out.println(string1 + " has repeats: "+isUnique(string1));
		System.out.println(string2 + " has repeats: "+isUnique(string2));
	}
	
	public static boolean isUnique(String str) {
		char[] charArray=str.replace(" ", "").toLowerCase().toCharArray();
		
		Arrays.sort(charArray);
		
		for(int i=1;i<charArray.length;i++) {
			if(charArray[i]==charArray[i-1]) {
				return true;
			}
		}
		return false;
	}
}
