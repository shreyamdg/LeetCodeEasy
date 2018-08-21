package arraysAndstrings;

public class StudentAttendenceRecord {
	public boolean checkRecord(String s) {
		int countA = 0;
		int countL = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				countA++;
				countL = 0;
			} else if (s.charAt(i) == 'L') {
				countL++;
			} else {
				countL = 0;
			}

			if (countA > 1) {
				return false;
			} else if (countL > 2) {
				return false;
			}
		}
		return true;
	}
}
