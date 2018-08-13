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
}
