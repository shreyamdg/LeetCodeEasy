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
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1};
		System.out.println(thirdMax(arr));

	}

}
