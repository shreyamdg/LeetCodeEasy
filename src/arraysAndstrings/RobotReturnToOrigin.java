package arraysAndstrings;

public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
		int i = 0;
		int j = 0;

		for (char ch : moves.toCharArray()) {
			if (ch == 'U') {
				i++;
			} else if (ch == 'D') {
				i--;
			} else if (ch == 'L') {
				j--;
			} else if (ch == 'R') {
				j++;
			} else {
				return false;
			}
		}

		if (i == 0 && j == 0) {
			return true;
		}

		return false;
	}
}
