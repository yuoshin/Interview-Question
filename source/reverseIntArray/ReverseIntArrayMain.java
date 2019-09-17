package reverseIntArray;

public class ReverseIntArrayMain {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Before reversing: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		int[] reverseArray = reverseArray(arr);
		System.out.println("\nAfter reversing:");
		for (int a : reverseArray) {
			System.out.print(a + " ");
		}

	}
	

	// Reverse array function
	static int[] reverseArray(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		return a;
	}

}
