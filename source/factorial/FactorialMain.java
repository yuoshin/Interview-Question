package factorial;

/* "four factorial" is written as "4!" and means 1�2�3�4 = 24 */

/**
 * Simple Java program to find the factorial of a number using recursion and iteration.
 * Iteration will use for loop while recursion will call method itself
 */

public class FactorialMain{

    public static void main(String args[]) {
      
      //finding factorial of a number in Java using recursion - Example
      System.out.println("factorial of 5 using recursion is: " + factorial(5)); 
      
      //finding factorial of a number in Java using Iteration - Example 
       System.out.println("factorial of 6 using iteration is: " + fact(6)); 
    }
  
  
    /* Java program example to find factorial of a number using recursion */

    public static int factorial(int number){       
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }
  
    /* Java program example to calculate factorial using while loop or iteration */
  
    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
      
        return result;
    }
}