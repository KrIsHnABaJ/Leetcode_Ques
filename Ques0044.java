class Solution {
    public boolean isMatch(String text, String pattern) {
        int n = pattern.length();
        int m = text.length();
        boolean prev[] = new boolean[m+1];
		boolean curr[] = new boolean[m+1];
        prev[0] =true;
        for (int i = 1; i <=n; i++) {
            curr[0]=isAllStars(pattern, i);
            for (int j = 1; j <=m; j++) {
                if(pattern.charAt(i-1)==text.charAt(j-1) || pattern.charAt(i-1) == '?') 
                    curr[j] = prev[j-1];
                else if(pattern.charAt(i-1) == '*'){
                    curr[j] = prev[j] | curr[j-1];
                }
                else curr[j] = false;
            }
			prev = curr.clone();
        }
        return prev[m];
    }
    boolean isAllStars(String pattern, int i) {
        for (int j = 1; j <= i; j++) {
            if (pattern.charAt(j - 1) != '*') return false;
        }
        return true;
    }
}
