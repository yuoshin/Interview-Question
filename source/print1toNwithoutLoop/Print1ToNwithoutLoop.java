package print1toNwithoutLoop;

public class Print1ToNwithoutLoop {

	public static void main(String[] args) {
		noLoop(89);

	}
	//Using tail recursion
	public  static void noLoop(int num) {
		if(num <= 100) {
			System.out.print(num + " ");
			num++;
			noLoop(num--);
		}else {
			System.exit(0);
		}
	}

}