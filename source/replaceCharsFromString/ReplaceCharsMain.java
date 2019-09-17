package replaceCharsFromString;

//Using iteration (For loop)

public class ReplaceCharsMain {
	/*public static void main(String[] args) {
		String words = "Hello world. I am a java program. How are you today?";
		char from = 'a';
		char to = '/';

		String changed = replace(words, from, to);
		System.out.println(words);
		System.out.println(changed);
	}

	public static String replace(String s, char from, char to) {
	    StringBuffer result = new StringBuffer(s.length());
	
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == from) {
	            result.append(to);
	        } else {
	            result.append(s.charAt(i));
	        }
	    }
	    return result.toString();
	
	}*/


//Using recursion (method calling itself)

	public static void main(String[] args) {
		String words = "hello world, i am a java program, how are you today?";
		char from = 'a';
		char to = '/';

		System.out.println(words);
		String ss = replace(words, from, to);
		System.out.println("New Replace String is =>  " + ss);
	}

	public static String replace(String s, char from, char to) {
		if (s.length() < 1)
			return s;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == from) {
				s = s.substring(0, i) + to + s.substring(++i);
				System.out.println(s);
				return replace(s, from, to);// calling replace()
			}
		}
		return s;
	}
}