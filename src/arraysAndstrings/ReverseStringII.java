package arraysAndstrings;

public class ReverseStringII {
	public static String reverseStr(String s, int k) {
		char[] str = s.toCharArray();
		int i = 0;

		while (i < str.length) {
			if ((str.length - i) >= 2 * k) {
				reverse(str, i, i+ k - 1);
				i = i + (2 * k);
			} else if ((str.length - i) < (2 * k) && (str.length - i) > k) {
				reverse(str, i, i + k - 1);
				i = str.length + 1;
			} else {
				reverse(str, i, str.length - 1);
				i = str.length + 1;
			}
		}

		return new String(str);
	}

	public static void reverse(char[] arr, int start, int end) {
		while (start < end) {
			char ch = arr[start];
			arr[start] = arr[end];
			arr[end] = ch;
			end--;
			start++;
		}
	}
}
