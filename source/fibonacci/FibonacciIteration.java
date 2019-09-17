package fibonacci;
import java.util.Scanner;

/* Fibonacci number is sum of previous two Fibonacci number */

public class FibonacciIteration {

	public static void main(String args[]) {
		System.out.println("Enter number up to which Fibonacci series to print: ");
		Scanner number = new Scanner(System.in);
		int inNumber = number.nextInt();
		//int number = new Scanner(System.in);
		//int number = new Scanner(System.in).nextInt();
		//System.out.println("Fibonacci series using iteration up to " + number + " numbers : ");
		
		/*for(int i=1; i<=number; i++){
			System.out.print(fibonacci2(i) +" ");
		}*/
		for(int i=1; i<=inNumber; i++){
			System.out.print(fibonacci2(i) +" ");
		}
	}
		
	/* Java program to calculate Fibonacci number using loop or iteration. */

	public static int fibonacci2(int number){
		if(number == 1 || number == 2){
			return 1;
		}
		int fibo1=1; 
		int fibo2=1;
		int fibonacci=1;
		for(int i= 3; i<= number; i++){
			
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci; //Fibonacci number
	}
}