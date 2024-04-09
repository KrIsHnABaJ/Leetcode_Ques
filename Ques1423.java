class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n =cardPoints.length-1;
        int r =n;
        int ans =0;
        int lsum =0;
        int rsum =0;
        for (int i = 0; i <k; i++) {
            lsum =lsum+cardPoints[i];
            ans =lsum;
        }
        for (int i = k-1; i >=0; i--) {
            lsum =lsum-cardPoints[i];
            rsum =rsum+cardPoints[r];
            r--;
            if(ans<rsum+lsum){
                ans = rsum+lsum;
            }
        }
        return ans;
    }
}
