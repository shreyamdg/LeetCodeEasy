
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		for (int k = j; k < nums.length; k++) {
			nums[k] = 0;
		}

		return nums.length - j;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 0, 3, 12 };
		System.out.println(removeElement(arr, 0));

	}
}
