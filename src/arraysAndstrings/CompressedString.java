package arraysAndstrings;

public class CompressedString {
	public int compress(char[] chars) {
		int indexAns = 0, index = 0;
		while (index < chars.length) {
			char currentChar = chars[index];
			int count = 0;
			while (index < chars.length && chars[index] == currentChar) {
				index++;
				count++;
			}
			chars[indexAns++] = currentChar;
			if (count != 1)
				for (char c : Integer.toString(count).toCharArray())
					chars[indexAns++] = c;
		}
		return indexAns;
	}

	public static String compressString(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;

			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				continue;
			} else {
				sb.append(s.charAt(i));
				sb.append(String.valueOf(count));
				count = 0;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(compressString("aabcccccaaa"));
	}
}
