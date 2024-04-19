class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][]after = new int[2][k+1];

        int profit =0;
        for (int i = n-1; i>=0; i--) {
            int[][]curr = new int[2][k+1];
            for (int buy = 0; buy <=1; buy++) {
                for (int cap = 1; cap <=k; cap++) {
                    if(buy==1){
                        profit = Math.max(-prices[i]+after[0][cap], 0+after[1][cap]);
                    }
                    else{
                        profit = Math.max(prices[i]+after[1][cap-1], after[0][cap]);
                    }
                    curr[buy][cap] = profit;
                }
            }
            after = curr;
        }
        return after[1][k];
    }
}
