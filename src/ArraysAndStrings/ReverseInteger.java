package ArraysAndStrings;

public class ReverseInteger {

	public static int reverse(int x) {
		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

}

class AnotherSolution {
	public static int reverse(int x) {
		try {
			if (x > 2147483646) {
				return 0;
			}

			String num = Integer.toString(x);

			if (num.charAt(0) == '-') {
				StringBuilder sb = new StringBuilder(num.substring(1));
				String str = sb.reverse().toString();
				return Integer.parseInt("-" + str);
			} else {
				StringBuilder sb = new StringBuilder(num);
				return Integer.parseInt(sb.reverse().toString());
			}

		} catch (NumberFormatException e) {
			return 0;

		}
	}
}
