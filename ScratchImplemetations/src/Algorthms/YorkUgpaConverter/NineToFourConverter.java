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
		
		int coursesTaken=input.nextInt();
		System.out.println("\nEnter the course grade followed by the credit value. For example: A+ 3");
		int credit;
		int totalCredits=0;
		int coursePoints=0;
		double yorkGPA;
		
		for(int i=1;i<=coursesTaken;i++) {
			System.out.print("Course "+i+": ");
			String grade=input.next();
			credit=input.nextInt();
			
			coursePoints=coursePoints+(gradeToNumericalConverterYork(grade)*credit);
			totalCredits=totalCredits+credit;
		}
		
		System.out.println("Total Grade Points: "+coursePoints+"\tTotal Credits Taken: "+totalCredits);
		yorkGPA=coursePoints / (double)totalCredits;
		System.out.printf("Your York GPA is: %.2f\n",yorkGPA);
		

	}

	public static int gradeToNumericalConverterYork(String grade) {
		
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
	
	public static double gradeToNumericalConverterFour(String grade) {
		
		switch(grade) {
		case "A+":
			return 4;
		case "A":
			return 3.8;
		case "B+":
			return 3.3;
		case "B":
			return 3;
		case "C+":
			return 2.3;
		case "C":
			return 2;
		case "D+":
			return 1.3;
		case "D":
			return 1;
		case "E":
			return 0.7;
		case "F":
			return 0;
		default:
			return 0;
	}
	}
}
