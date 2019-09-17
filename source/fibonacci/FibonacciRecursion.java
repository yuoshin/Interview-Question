package fibonacci;
import java.util.Scanner;

/* Fibonacci number is sum of previous two Fibonacci number */

public class FibonacciRecursion {

	public static void main(String args[]) {
		
		System.out.println("Enter number up to which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series using recursion up to " + number + " numbers : ");
		
		for(int i=1; i<=number; i++){
			System.out.print(fibonacci(i) +" ");
		}
	}
		/* Java program for Fibonacci number using recursion (A method calling itself is called recursion.)
		 This program uses tail recursion to calculate Fibonacci number for a given number */

		public static int fibonacci(int number){
			if(number == 1 || number == 2){
				return 1;
			}
			return fibonacci(number-1) + fibonacci(number -2); //tail recursion
		}
}