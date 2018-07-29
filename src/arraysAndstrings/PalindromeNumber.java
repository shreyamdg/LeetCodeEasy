package arraysAndstrings;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		int rev = 0;
		if (x < 0)
			return false;
		int num = x;
		while (x != 0) {
			rev = rev * 10 + (x % 10);
			x = x / 10;
		}

		if (num == rev)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
}
