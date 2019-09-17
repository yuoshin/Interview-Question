package capitalizeFirstCharOfString;

public class CapitalizeMain {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
		
		System.out.println(a.length()+b.length());	//finds length of both strings
		System.out.println(a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1) );	//capitalises first char of str a
		
	}
}
