package Algorithms;

public class EfficientFibonacci {

	public static void main(String[] args) {
		int f1=0;
		int f2=1;
		
		int termNumber = 50;

		fibonacciCalculator(f1, f2, termNumber); //overflow at term 45
	}
	
	public static void fibonacciCalculator(int first, int second, int termNumber) {
		int answer;
		
		for(int i=0;i<termNumber;i++) {
			answer=first+second;
			System.out.println("Term "+ i + " is equal to " + answer);
			first=second;
			second=answer;
		}
		
	}

}