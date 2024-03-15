class Solution {
    public int change(int value, int[] denominations) {
        int n= denominations.length;
        int[]prev = new int[value+1];
        prev[0]=1;
        for (int tar = 0; tar <=value; tar++) {
            if(tar%denominations[0]==0){
                prev[tar] =1;
            }
            else{
                prev[tar]=0;
            }
        }
        for (int i = 1; i < n; i++) {
            int[]curr = new int[value+1];
            curr[0]=1;
            for (int tar = 0; tar <=value; tar++) {
                int not_take=prev[tar];
                int take =0;
                if(denominations[i]<=tar){
                    take =curr[tar-denominations[i]];
                }
                curr[tar]=take+not_take;
            }
            prev =curr;
        }
        return prev[value];
    }
}
