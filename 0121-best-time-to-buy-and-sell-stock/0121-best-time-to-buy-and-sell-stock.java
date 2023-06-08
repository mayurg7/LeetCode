class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                int curr = prices[i]-buy;
               profit = Math.max(profit,curr);
            }
        }
        return profit;
    }
}