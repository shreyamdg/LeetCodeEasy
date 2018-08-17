package arraysAndstrings;

public class StringRotation {
	public boolean rotateString(String A, String B) {
		int len = A.length();
		if (len == B.length() && len >= 0) {
			String s1s1 = A + A;
			return isSubstring(s1s1, B);
		}

		return false;
	}

	public boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
