package arraysAndstrings;

public class RemoveDupFromSortedArr {
	public static int removeDuplicates(int[] nums) {
		if (nums.length < 1) {
			return 0;
		}

		int small = nums[0];
		int last = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > small) {
				int temp = nums[i];
				nums[i] = nums[last];
				nums[last] = temp;
				small = temp;
				last++;
			}

		}
		return last;
	}

	
	// Another solution
	/*public static int removeDuplicates(int[] nums) {
		int i = 1;
		int j = 1;

		while (j < nums.length) {
			if (nums[j] != nums[j - 1]) {
				move(nums, i, j);
				++i;
			}
			++j;
		}
		return i;
	}

	public static void move(int[] nums, int i, int j) {
		nums[i] = nums[j];
	}*/

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates(arr);
		for (int i : arr)
			System.out.println(i);
	}
}
