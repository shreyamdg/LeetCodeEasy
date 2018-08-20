package arraysAndstrings;

public class RepeatedSubstringPattern {
	 public static boolean repeatedSubstringPattern(String str) {
	        String s = str + str;
	        return s.substring(1, s.length() - 1).contains(str);
	    }
	 public static void main(String []args) {
		 System.out.println(repeatedSubstringPattern("abab"));
		 System.out.println(repeatedSubstringPattern("aba"));
		 System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	 }
}
