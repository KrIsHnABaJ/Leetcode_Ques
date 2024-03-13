class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum =0;
		for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if(sum%2==1){
            return false;
        }
        int target = sum/2;
        return subsetSumToK(n, target, arr);
    }
    public boolean subsetSumToK(int n, int k, int arr[]) {
        boolean[] prev = new boolean[k + 1];
        prev[0] = true;
        if (arr[0] <= k) {
            prev[arr[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            boolean[] curr = new boolean[k + 1];
            curr[0] = true;
            for (int j = 1; j <= k; j++) {

                boolean not_take = prev[j];
                boolean take = false;
                if (arr[i] <= j) {
                    take = prev[j - arr[i]];
                }
                curr[j] = take || not_take;
            }
            prev = curr;
        }
        return prev[k];
    }
}
