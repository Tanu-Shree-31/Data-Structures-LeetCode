class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, maxProfit =0;
        while(r<prices.length){
            if(prices[r] >= prices[l]) {
                // calculate profit
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
                r++;
            } else {
                l++;
            } 
        }
        return maxProfit;
    }
}