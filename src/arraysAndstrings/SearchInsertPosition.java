package arraysAndstrings;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (index == 0 && nums[i] > target) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,6};
		System.out.println(searchInsert(arr, 7));
	}

}
