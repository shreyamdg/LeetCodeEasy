package ArraysAndStrings;
import java.util.Arrays;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int count = 2;
        for(int i =nums.length-2; i>= 0; i--){
            if(nums[i] < max && count > 0){
            	max = nums[i];
                count--; 
            }
        }
        
        if(count == 0){
            return max;
        }else
            return nums[nums.length-1];
    }
	
	//Time efficient O(n)
	public int AnotherSolutionThirdMax(int[] nums) {
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;

		for (Integer n : nums) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3))
				continue;
			if (max1 == null || n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || n > max2) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || n > max3) {
				max3 = n;
			}
		}
		return max3 == null ? max1 : max3;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1};
		System.out.println(thirdMax(arr));

	}

}
