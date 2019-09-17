package sortedset;

/*
 * Given a string, and an integer, complete the function so that it finds the lexicographically 
 * smallest and largest substrings of length.
 * The first line contains a string denoting s. 
 * The second line contains an integer denoting k.
 * Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
 */

/*
 * Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows: 
 * For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
 * A substring of a string is a contiguous block of characters in the string. 
 * For example, the substrings of abc are a, b, c, ab, bc, and abc.
 * 
 * String s = "welcometojava" has the following lexicographically-ordered substrings of length k=3:
 * ["ava","com","elc","eto","jav","lco","met","oja","ome","toj","wel"]
 * 
 * We then return the first (lexicographically smallest) substring and the last (lexicographically largest) 
 * substring as two newline-separated values
 * Output will be ava wel
 */


import java.util.*;

public class SortedSetMain {
  
    public static String getSmallestAndLargest(String s, int k) {        
        SortedSet<String> sets=new TreeSet<String>();        
	    for(int i=0;i<=s.length()-k;i++){
	        sets.add(s.substring(i,i+k));
	    }
        return sets.first() + "\n" + sets.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
