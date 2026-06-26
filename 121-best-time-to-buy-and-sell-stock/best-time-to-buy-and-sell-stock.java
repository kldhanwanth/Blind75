class Solution {
    public int maxProfit(int[] prices) {
        int min=10000;
        int profit=0;
        for(int p:prices){
            min=Math.min(p,min);
            profit=Math.max(p-min,profit);
        }
        return profit;
    }
}