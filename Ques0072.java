class Solution {
    public int minDistance(String str1, String str2) {
        int n = str1.length();
        int m =str2.length();
        int[]prev =new int[m+1];
        for (int j = 0; j <=m; j++) {
            prev[j] = j;
        }
        for (int i = 1; i <=n; i++) {
            int[]curr =new int[m+1];
            curr[0] =i;
            for (int j = 1; j <=m; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    curr[j] = prev[j-1]+0;
                }else{
                    int insert =curr[j-1]+1;
                    int delete =prev[j]+1;
                    int replace =prev[j-1]+1;
                    curr[j] = Math.min(Math.min(insert, delete), replace);
                }
            }
            prev = curr;
        }
        return prev[m];
    }
}
