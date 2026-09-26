class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0], maxProfit = 0;
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price-lowest);
            lowest = Math.min(lowest, price);
        }
        return maxProfit;
    }
}
