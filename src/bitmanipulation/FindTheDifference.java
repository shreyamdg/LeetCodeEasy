package bitmanipulation;

public class FindTheDifference {
	public char findTheDifference(String s, String t) {
		char[] ch1 = (s + t).toCharArray();
		int result = 0;
		for (int i = 0; i < ch1.length; i++) {
			result ^= ch1[i];
		}

		return (char) result;
	}
}
