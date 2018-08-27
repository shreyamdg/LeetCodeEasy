package arraysAndstrings;

import java.util.HashMap;

public class NextGreaterElementOne {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] arr = new int[nums1.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			if (i + 1 < nums2.length) {
				if (nums2[i + 1] > nums2[i]) {
					map.put(nums2[i], nums2[i + 1]);
				} else {
					int j = i + 2;
					while (j < nums2.length) {
						if (nums2[j] > nums2[i]) {
							map.put(nums2[i], nums2[j]);
							break;
						}
						j++;
					}
				}
			}
		}

		for (int i = 0; i < nums1.length; i++) {
			if (map.get(nums1[i]) == null) {
				arr[i] = -1;
			} else {
				arr[i] = map.get(nums1[i]);
			}
		}

		return arr;
	}
}
