package Algorthms.YorkUgpaConverter;
import java.util.Scanner;

// Conversion Table can be found at:
// https://gradecalc.info/ca/on/yorku/gpa_calc.pl
// and https://laps.yorku.ca/student-resources/gpa-calculator/

public class NineToFourConverter {

	public static void main(String[] args) {
		System.out.println("This program takes your YorkU GPA and converts it to the traditional 4.0 scale\n");
		System.out.print("Please enter the number of courses taken so far \n(1)\tIgnore pass/fail courses"
				+ "\n(2)\tEnter repeated courses only once\n\n");
		System.out.print("Enter the number of courses: ");
		
		Scanner input=new Scanner(System.in);
		
		int counter=input.nextInt();
		
		
		

	}

	public static int gradeToNumericalConverter(String grade) {
		
		switch(grade) {
			case "A+":
				return 9;
			case "A":
				return 8;
			case "B+":
				return 7;
			case "B":
				return 6;
			case "C+":
				return 5;
			case "C":
				return 4;
			case "D+":
				return 3;
			case "D":
				return 2;
			case "E":
				return 1;
			case "F":
				return 0;
			default:
				return 0;
		}
	}
	
}
