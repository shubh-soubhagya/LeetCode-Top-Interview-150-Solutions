// NOTE:
// This file includes only the Solution class, not a complete executable program. 
// It serves as a reference to help you review and understand the logic whenever needed.


class Solution {
    public static int maxProfit(int[] prices) {


        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            else{
                int profit = prices[i] - minPrice;
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    
}