class Solution {
    public int minDistance(String s1, String s2) {
         int n= s1.length();
        int m =s2.length();
        int[]prev = new int[m+1];
        for (int j = 0; j <=m; j++) {
            prev[j]=0;
        }
        for (int i = 1; i <=n; i++) {
            int[]curr = new int[m+1];
            for (int j = 1; j <=m; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j] =1+ prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j], curr[j-1]);
                }
            }
            prev = curr;
        }
        int lcs = prev[m];
        int ans = n+m-2*lcs;
        return ans;
    }
}
