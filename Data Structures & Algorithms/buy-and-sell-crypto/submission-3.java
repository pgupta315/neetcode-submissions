class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int currMax = prices[size-1];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = size-1; i>=0; i--) {
            int profitBoughtThisDay = currMax - prices[i];
            currMax = Math.max(currMax, prices[i]);
            maxProfit = Math.max(maxProfit, profitBoughtThisDay);
        }
        return maxProfit;
    }
}
