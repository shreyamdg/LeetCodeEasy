package ArraysAndStrings;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(arr, 2));

	}
}
