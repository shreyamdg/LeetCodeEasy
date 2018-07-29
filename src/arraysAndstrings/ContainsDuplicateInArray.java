package arraysAndstrings;
import java.util.Arrays;

public class ContainsDuplicateInArray {
	
	public static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        
        Arrays.sort(nums);
        
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        
        return false;
    }

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 1, 5, 3, 6, 4, 1 };
		System.out.println(containsDuplicate(arr));
	}

}
