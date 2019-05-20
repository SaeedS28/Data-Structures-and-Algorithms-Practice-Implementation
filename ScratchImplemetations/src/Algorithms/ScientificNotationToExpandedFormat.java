package Algorithms;

import java.util.Scanner;

public class ScientificNotationToExpandedFormat {

	public static void main(String[] args) {
		final String regexForProperSN = "-?\\d+(\\.?\\d*)[xX]{1}10\\^-?\\d+$";
		
		System.out.print("Enter a number in scientific notation to convert it to its expanded form.\t"
				+ "For example -3x10^-13 or 3.26X10^12\n\nEnter it now: ");
		
		Scanner input= new Scanner(System.in);
		
		String string = input.nextLine().replaceAll(" ", "");
		input.close();
		
		boolean matches = string.matches(regexForProperSN);
		
		if(matches) {
			System.out.println("Yay");
		}else {
			System.out.println("Nay");
		}
		
		
	}

}
