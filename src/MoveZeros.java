
public class MoveZeros {

	public static void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}

		}

		for (int k = j; k < nums.length; k++) {
			nums[k] = 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(arr);
		for (int i : arr)
			System.out.println(i);
	}
}
