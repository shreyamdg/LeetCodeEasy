
public class StockTwo {
	public static int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;

		int profit = 0;
		int minElement = prices[0];

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - minElement > 0) {
				profit += prices[i] - minElement;
			}

			minElement = prices[i];
		}

		return profit;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 1, 5, 3, 6, 4 };
		maxProfit(arr);
	}
}
