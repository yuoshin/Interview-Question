package armstrong;
import java.util.Scanner;

/* An Armstrong number is a 3-digit number for which sum of cube of its
 * digits is equal to the number itself. An example of Armstrong number is 
 * 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3. 
 * One more example of the Armstrong number is 371 because it is the sum of 
 * 27 + 343 + 1 which is equal to 3^3 + 7^3 + 1^3. */

public class ArmstrongMain{ 
	public static void main(String args[]){

		System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
		int number = new Scanner(System.in).nextInt();
		
		//printing result 
		if(isArmStrong(number)){
			System.out.println("Number : " + number + " is an Armstrong number");
		}
		else{
			System.out.println("Number : " + number + " is not an Armstrong number");
		}
	}
	/* * @return true if number is Armstrong number or return false */ 
	private static boolean isArmStrong(int number){
		int result = 0;
		int orig = number;
		while(number != 0){
			int remainder = number%10;
			result = result + remainder*remainder*remainder;
			number = number/10;
		} //number is Armstrong return true
		if(orig == result){
			return true;
		} return false;
	}
/* It’s a pretty simple Java program and if you look closely it just gets digit
 * by digit by using remainder operator and reduce number by 1 digit after dividing it by 10. */
}