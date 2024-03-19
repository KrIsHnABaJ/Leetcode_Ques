class Solution {
    public int numDistinct(String str, String sub) {
        int n = str.length();
        int m = sub.length();
        int[]prev = new int[m+1];
        prev[0]=1;
        for (int i = 1; i <=n; i++) {
            for (int j = m; j>=1; j--) {
                if(str.charAt(i-1)==sub.charAt(j-1)){
                    prev[j] = prev[j-1]+prev[j];
                }
            }
        }
        return prev[m];
    }
}
