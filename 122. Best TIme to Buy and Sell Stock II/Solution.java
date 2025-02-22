// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
