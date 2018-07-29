package ArraysAndStrings;
import java.util.Arrays;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int count = 0;
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[count];
			count++;
		}

		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = new int[] { 2, 5, 6 };
		int m = 3, n = 3;
		merge(arr1, m, arr2, n);

		for (int i : arr1) {
			System.out.println(i);
		}
	}
}
