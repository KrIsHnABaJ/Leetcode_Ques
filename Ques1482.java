class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k > n){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high=Math.max(high,bloomDay[i]);
            low = Math.min(low,bloomDay[i]);
        }
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay,mid, m, k)){
                ans =mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean possible(int[] bloomDay,int ind,int m,int k){
        int count =0;
        int B =0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=ind){
                count++;
            }else{
                B+=count/k;
                count =0;
            }
        }
        B+=count/k;
        if(B>=m) return true;
        else return false;
    }
}
