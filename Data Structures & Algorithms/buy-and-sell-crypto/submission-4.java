class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        for(int sell = 1; sell<prices.length; sell++){
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            max = Math.max(max, prices[sell]-prices[buy]);
        }
        
        return max;
    }
}
