class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0], highest = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= lowest) {
                lowest = highest = prices[i];
            } else if (prices[i] > highest) {
                highest = prices[i];
                maxProfit = Math.max(maxProfit, highest - lowest);
            }
        }
        return maxProfit;
    }
}
