package arraysAndstrings;
import java.util.Arrays;

public class MajorElement {
	public static int majorityElement(int[] nums) {
		int major = nums[0], count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0)
				major = nums[i];
			if (nums[i] == major)
				++count;
			else
				--count;
		}
		return major;
	}
 
	// Another solution. Less time efficient
	public int majorityElementAnotherSolution(int[] nums) {
		Arrays.sort(nums);
		int key = nums[0];
		int key2 = 0;
		int count = 1;
		int count2 = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
				key = nums[i];
			} else if (count > count2) {
				count2 = count;
				count = 1;
				key2 = nums[i - 1];
			}
		}

		if (count > count2)
			return key;
		else
			return key2;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 2, 3, 1, 3, 3, 1 };
		System.out.println(majorityElement(arr));
	}
}
