package arraysAndstrings;

public class ReverseWordsinaStringIII {
	public String reverseWords(String s) {
		if (s.length() <= 0) {
			return s;
		}

		int count = 0;
		for (char ch : s.toCharArray()) {
			if (ch == ' ') {
				count++;
			}
		}

		StringBuilder sb = new StringBuilder();
		String[] arr = s.split(" ");
		for (String str : arr) {
			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
			if (count > 0) {
				sb.append(" ");
				count--;
			}
		}

		return sb.toString();
	}
}
