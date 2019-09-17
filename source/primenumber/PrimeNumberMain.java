package primenumber;
import java.util.Scanner;

/*
 * Simple Java program to print prime numbers from 1 to 100 or any number.
 * A prime number is a number which is greater than 1 and divisible by either 1 or itself.
 */

public class PrimeNumberMain {

    public static void main(String args[]) {
    
      System.out.println("Printing prime number from 1 to 100: ");
      for(int number = 2; number<=100; number++){
          //print prime numbers only
          if(isPrime(number)){
              System.out.print(number + ", ");
          }
      }
    }

    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}