package ArraysAndStrings;
import java.util.HashMap;

class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}

		return null;

	}
}

class SolutionTwo {
	public static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
  
		for(int i = 0; i< nums.length; i++) {
			numbers.put(nums[i],i);
		}
		
		for(int i = 0; i< nums.length; i++) {
			int diff = target - nums[i];
			if(numbers.containsKey(diff) && numbers.get(diff) != i) {
				int secondnum = numbers.get(diff);
				return new int [] {i, secondnum};
			}
			
		}
		
		return null;
	}
}