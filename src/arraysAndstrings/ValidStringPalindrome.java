package arraysAndstrings;

public class ValidStringPalindrome {

	public static boolean isPalindrome(String s) {
		if (s.isEmpty())
			return true;

		String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		char[] arr = str.toCharArray();
		int last = str.length() - 1;
		int first = 0;

		while (first < last) {
			char ch = arr[first];
			arr[first] = arr[last];
			arr[last] = ch;
			first++;
			last--;
		}

		String newStr = new String(arr);

		if (newStr.equals(str))
			return true;

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
}
