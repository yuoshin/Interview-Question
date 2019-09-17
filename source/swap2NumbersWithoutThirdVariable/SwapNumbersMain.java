package swap2NumbersWithoutThirdVariable;

public class SwapNumbersMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("Before swapping:\nx= "+ x +"\n" + "y: " + y + "\n");
		
		x = x + y;	//x is now 15
		y = x - y;	//y is now 10 and swapped
		x = x - y;	//x is now 5 and swapped
		
		System.out.println("After swapping:\nx= "+ x +"\n" + "y: " + y);	
	}
}