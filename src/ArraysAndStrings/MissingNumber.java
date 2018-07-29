package ArraysAndStrings;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int length = nums.length;
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		return ((length * (length + 1)) / 2) - sum;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(arr1));
	}

}
