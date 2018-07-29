package ArraysAndStrings;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] arr = new int[128];

		for (int i = 0; i < magazine.length(); i++) {
			int val = magazine.charAt(i);
			arr[val] = arr[val] + 1;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			int val = ransomNote.charAt(i);
			arr[val] = arr[val] - 1;
			if (arr[val] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));

	}

}
