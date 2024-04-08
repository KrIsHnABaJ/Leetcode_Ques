class Solution {
    public int coinChange(int[] denominations, int value) {
        int n = denominations.length;
        int prev[] = new int[value+1];
        for (int i = 0; i <= value; i++) {
            if(i%denominations[0]==0) prev[i] = i/denominations[0];
            else prev[i] = (int)1e9+7;
        }
        for (int i = 1; i < n; i++) {
            int[] curr = new int[value+1];
            for (int j = 0; j <=value; j++) {
                int not_take = prev[j];
                int take =(int)1e9+7;
                if(denominations[i]<=j){
                    take=1+curr[j-denominations[i]];
                }
                curr[j] = Math.min(not_take, take);
            }
            prev = curr;
        }
        if(prev[value]==(int)1e9+7) return -1;
        else return prev[value];
    }
}
