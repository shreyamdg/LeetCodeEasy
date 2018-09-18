package arraysAndstrings;

import java.util.HashMap;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int diff = target - numbers[i];
			if (nums.containsKey(diff)) {
				return new int[] { nums.get(diff) + 1, i + 1 };
			}

			nums.put(numbers[i], i);

		}

		return null;
	}
}
