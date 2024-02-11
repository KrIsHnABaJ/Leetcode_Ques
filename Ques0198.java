class Solution {
    public int rob(int[] arr) {
        int prev = arr[0];
        int prev2 = 0;
        int n = arr.length;
        for (int i =1;i<n;i++){
            int pick = arr[i];
            if(i>1){
                pick+=prev2;
            }
            int not_pick = prev;
            int curri = Math.max(pick, not_pick);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}
