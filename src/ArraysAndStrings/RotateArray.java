package ArraysAndStrings;

public class RotateArray {
	/*
	 * For Left rotation. Divide array in two parts A & B
	 *  A = Reverse(0 to k - 1)
	 *  B = Reverse(k to arraylength -1)
	 *  Then Reverse whole Array ( 0 to Arraylength-1)
	 */
	
	/*
	 * For Right rotation. Divide array in two parts A & B
	 *  A = Reverse(0 to arraylength - k - 1)
	 *  B = Reverse(arraylength-k to arraylength -1)
	 *  Then Reverse whole Array ( 0 to Arraylength-1)
	 */
    
    public static void rotate(int[] nums, int k) {
        
       int arrlength = nums.length;        
        if(k> arrlength){
            k = k%arrlength;
        }
       reverseArray(nums, 0, arrlength-k-1);
       reverseArray(nums, arrlength-k, arrlength - 1);
       reverseArray(nums, 0, arrlength - 1);
    }
    
     static void reverseArray(int arr[], int start,
                             int end)
    {
        while (start < end)
        {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
         }
    }
     
     public static void main(String[] args) {
    	int [] arr = new int [] {1,2,3,4,5,6,7};
 		rotate(arr, 3);
 	}
}
