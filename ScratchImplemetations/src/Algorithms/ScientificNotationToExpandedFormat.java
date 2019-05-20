package Algorithms;

import java.util.Scanner;

public class ScientificNotationToExpandedFormat {

	public static void main(String[] args) {
		final String regexForProperSN = "-?\\d+(\\.?\\d*)[xX]{1}10\\^-?\\d+$";
		
		System.out.print("Enter a number in scientific notation to convert it to its expanded form.\n"
				+ "For example -3x10^-13 or 3.26X10^12\n\nEnter it now: ");
		
		Scanner input= new Scanner(System.in);
		
		String string = input.nextLine().replaceAll(" ", "");
		input.close();
		
		boolean matches = string.matches(regexForProperSN);
		
		if(matches) {
			double numeralPart=Double.parseDouble(string.substring(0, string.toLowerCase().indexOf("x")));
			//System.out.println(numeralPart);
			
			int power = Integer.parseInt(string.substring(string.indexOf("^")+1));
			//System.out.println(power);
			
			if(power<0) {
				for(int i=0;i<Math.abs(power);i++) {
					numeralPart=numeralPart/10;
				}
			}else {
				for(int i=0;i<power;i++) {
					numeralPart=numeralPart*10;
				}
			}
			System.out.println("\nThe number in its numeral format is: " + numeralPart);
		}else {
			System.out.println("The expression you have entered is syntactiacally incorrect. Try again.");
		}
		
		
	}

}
