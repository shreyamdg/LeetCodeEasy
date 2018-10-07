package arraysAndstrings;

public class RemoveVowel {
	public static String removeVowel(String str) {
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(!isVowel(ch)) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static boolean isVowel(char c) {
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
			c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}
	
	public static void main(String [] args) {
		System.out.println(removeVowel("GeeeksforGeeks - A Computer Science Portal for Geeks"));
		System.out.println(removeVowel("welcome to geeksforgeeks"));
		System.out.println(removeVowel("what is your name "));
		System.out.println(removeVowel("wht s yr nm"));
		System.out.println(removeVowel(" "));
		System.out.println(removeVowel(""));
	}
}
