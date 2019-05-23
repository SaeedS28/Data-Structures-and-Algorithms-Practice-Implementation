package Agorithms.CTCIChap1;

import java.util.Arrays;

public class IsPermutation {

	public static void main(String[] args) {
		String str1=new String("Saad");
		String str2=new String("Sada");

		String str3=new String("Surface");
		String str4=new String("acef");
		
		System.out.println(str1+" is a permutation of "+str2+": " + isPermutation(str1, str2));
		System.out.println(str4+" is a permutation of "+str3+": " + isPermutation(str4, str3));

	}
	
	public static boolean isPermutation(String a, String b) {
		if (a.length()==b.length()) {
			char[] arrayA = a.toCharArray();
			char[] arrayB = b.toCharArray();

			Arrays.sort(arrayA);
			Arrays.sort(arrayB);

			for (int i = 0; i < arrayA.length; i++) {
				if (arrayA[i]!=arrayB[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
