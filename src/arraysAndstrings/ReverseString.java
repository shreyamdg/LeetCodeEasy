package arraysAndstrings;

public class ReverseString {
	public String reverseString(String str) {
		char[] strArray = str.toCharArray();
		int right = strArray.length - 1;
		int left = 0;

		for (left = 0; left < right; left++, right--) {
			char temp = strArray[left];
			strArray[left] = strArray[right];
			strArray[right] = temp;
		}

		return new String(strArray);
	}
}
