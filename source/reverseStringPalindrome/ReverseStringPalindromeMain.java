package reverseStringPalindrome;

public class ReverseStringPalindromeMain {

	public static void main(String[] args) {

		String a = "madam";
		StringBuilder sb = new StringBuilder(a); // To use reverse method, need to use StringBuilder
		String b = sb.reverse().toString(); // Reverse the string and convert back to String
		if (a.equals(b)) { // For String, must use equals() method instead of ==
			System.out.print("True");
		} else
			System.out.print("False");

	}

}
