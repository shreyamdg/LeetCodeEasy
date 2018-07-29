package ArraysAndStrings;

public class LengthofLastWord {
	public static int lengthOfLastWord(String s) {
		String[] strArr = s.split("\\s");
		if (strArr.length == 0)
			return 0;
		else
			return strArr[strArr.length - 1].length();
	}
	
	//Time Efficient.
	public static int anotherSolution(String s) {
		s = s.trim();
		String lastWord = s.substring(s.lastIndexOf(" ") + 1);
		if (lastWord.isEmpty() || lastWord == null) {
			return 0;
		}
		return lastWord.length();
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("     "));

	}

}
