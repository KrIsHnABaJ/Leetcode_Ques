class Solution {
    public static int findTargetSumWays(int[] nums, int target) {
        int totSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totSum += nums[i];
        }
        if ( totSum - target < 0 ||   (totSum - target) % 2 == 1) {
            return 0;
        }
        return f(nums,(totSum - target) / 2);
    }

    private static int f(int[] nums, int target) {
        int[][] dp = new int[nums.length][target + 1];
        if (nums[0] == 0) {
            dp[0][0] = 2;
        } else {
            dp[0][0] = 1;
        }
        if(nums[0]!=0 && nums[0]<=target){
            dp[0][nums[0]]=1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int tar = 0; tar <=target; tar++) {
                int not_take=dp[i-1][tar];
                int take=0;
                if(nums[i]<=tar){
                    take=dp[i-1][tar-nums[i]];
                }
                dp[i][tar]=take+not_take;
            }
        }
        return dp[nums.length-1][target];
    }
}
