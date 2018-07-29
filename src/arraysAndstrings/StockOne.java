package arraysAndstrings;

public class StockOne {
	public static int maxProfit(int[] prices) {
		int size = prices.length;
		if (size == 0) {
			return 0;
		}

		int diff = 0;
		int min = prices[0];

		for (int i = 1; i < size; i++) {
			if (prices[i] - min > diff) {
				diff = prices[i] - min;
			}

			if (prices[i] < min) {
				min = prices[i];
			}

		}

		return diff;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 1, 5, 3, 6, 4 };
		maxProfit(arr);
	}
}
