package arraysAndstrings;

import java.util.HashMap;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> charCount = new HashMap<>();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (!charCount.containsKey(ch)) {
				charCount.put(ch, 1);
			} else {
				charCount.put(ch, charCount.get(ch) + 1);
			}
		}

		for (char ch : t.toLowerCase().toCharArray()) {
			if (!charCount.containsKey(ch)) {
				charCount.put(ch, 1);
			} else {
				charCount.put(ch, charCount.get(ch) - 1);
			}
		}

		for (Character ch : charCount.keySet()) {
			if ((charCount.get(ch) != 0)) {
				return false;
			}
		}
		return true;
	}

	public boolean isAnagramTwo(String s, String t) {

		if (s.isEmpty() && t.isEmpty())
			return true;
		if (s.length() != t.length())
			return false;

		int[] arr = new int[26];

		for (char c : s.toCharArray()) {
			arr[c - 'a'] = arr[c - 'a'] + 1;
		}

		for (char c : t.toCharArray()) {
			arr[c - 'a'] = arr[c - 'a'] - 1;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0)
				return false;
		}
		return true;
	}
}
