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
	
	public static String removeVowelAnotherSol(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}
	
	public static void main(String [] args) {
		System.out.println(removeVowelAnotherSol("GeeeksforGeeks - A Computer Science Portal for Geeks"));
		System.out.println(removeVowelAnotherSol("welcome to geeksforgeeks"));
		System.out.println(removeVowelAnotherSol("what is your name "));
		System.out.println(removeVowelAnotherSol("wht s yr nm"));
		System.out.println(removeVowelAnotherSol(" "));
		System.out.println(removeVowelAnotherSol(""));
	}
}
